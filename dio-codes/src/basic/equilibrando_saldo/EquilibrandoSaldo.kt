package basic.equilibrando_saldo

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 25)
    val input: Array<CharSequence> = arrayOf(reader.readLine(), reader.readLine(), reader.readLine())
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

fun main() {
    val input: Array<CharSequence> = getInput()
    val balance = parse(input[0])
    val deposit = parse(input[1])
    val withdrawal = parse(input[2])
    val finalValue = balance + deposit - withdrawal
    val output: CharSequence = "Saldo atualizado na conta: $finalValue.0"
    OutputStreamWriter(System.out).append(output).close()
}