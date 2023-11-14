package basic.grande_deposito

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): CharSequence {
    val reader = BufferedReader(InputStreamReader(System.`in`), 15)
    val input = reader.readLine()
    reader.close()
    return input
}

private fun getOutput(deposit: CharSequence): CharSequence =
    if (deposit[0] == '-') "Valor invalido! Digite um valor maior que zero."
    else if (deposit[0] == '0') "Encerrando o programa..."
    else "Deposito realizado com sucesso!\r\nSaldo atual: R$ $deposit"

fun main() {
    val deposit: CharSequence = getInput()
    val output: CharSequence = getOutput(deposit)
    OutputStreamWriter(System.out).append(output).close()
}