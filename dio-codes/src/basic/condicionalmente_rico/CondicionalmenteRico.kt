package basic.condicionalmente_rico

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 20)
    val input: Array<CharSequence> = arrayOf(reader.readLine(), reader.readLine())
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

private fun getOutput(final: Int): CharSequence = if (final >= 0) "Saque realizado com sucesso. Novo saldo: $final"
else "Saldo insuficiente. Saque nao realizado!"

fun main() {
    val input: Array<CharSequence> = getInput()
    val balance = parse(input[0])
    val withdrawal = parse(input[1])
    val finalValue = balance - withdrawal
    val output: CharSequence = getOutput(finalValue)
    OutputStreamWriter(System.out).append(output).close()
}