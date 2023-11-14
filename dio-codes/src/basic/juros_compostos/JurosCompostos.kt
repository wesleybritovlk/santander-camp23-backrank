package basic.juros_compostos

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<String> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 25)
    val input = arrayOf(reader.readLine(), reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private fun parse(csq: CharSequence): Int {
    var result = 0
    val radix = 10
    val length = csq.length
    for (i in 0 until length) {
        val digit: Int = Character.digit(csq[i], radix)
        result *= radix
        result -= digit
    }
    return -result
}

private fun calcTime(rate: Double, time: Int): Double {
    var result = 1.0
    for (i in time downTo 1) result *= rate
    return result
}

fun main() {
    val input: Array<String> = getInput()
    val principal = parse(input[0])
    val time = parse(input[2])
    val rate = 1 + input[1].toDouble()
    val amount = principal * calcTime(rate, time)
    val output: CharSequence = "Valor final do investimento: R\$ %.2f".format(amount)
    OutputStreamWriter(System.out).append(output).close()
}