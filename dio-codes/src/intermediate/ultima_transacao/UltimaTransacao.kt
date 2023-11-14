package intermediate.ultima_transacao

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 45)
    val input: Array<CharSequence> = reader.readLine().split(',').toTypedArray()
    reader.close()
    return input
}

private class Transaction(
    val date: CharSequence, val hour: CharSequence, val description: CharSequence, val value: CharSequence
)

fun main() {
    val input: Array<CharSequence> = getInput()
    val transaction = Transaction(input[0], input[1], input[2], input[3])
    val output = "${transaction.description}\r\n${transaction.date}\r\n${transaction.hour}\r\n${transaction.value}"
    OutputStreamWriter(System.out).append(output).close()
}