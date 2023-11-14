package basic.organizando_ativos

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 85)
    reader.readLine()
    val input: Array<CharSequence> = arrayOf(reader.readLine(), reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private fun organize(input: Array<CharSequence>): CharSequence {
    val sort1 = input[0][0] < input[1][0]
    val sort2 = input[0][0] < input[2][0]
    return if (sort1) "${input[0]}\r\n${input[2]}\r\n${input[1]}"
    else if (sort2) "${input[1]}\r\n${input[0]}\r\n${input[2]}"
    else "${input[1]}\r\n${input[2]}\r\n${input[0]}"
}

fun main() {
    val input: Array<CharSequence> = getInput()
    val output: CharSequence = organize(input)
    OutputStreamWriter(System.out).append(output).close()
}