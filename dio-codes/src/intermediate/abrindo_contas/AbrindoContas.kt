package intermediate.abrindo_contas

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 40)
    val input: Array<CharSequence> = arrayOf(reader.readLine(), reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private class BankAccount(val accountNumber: CharSequence, val owner: CharSequence, val balance: CharSequence)

fun main() {
    val input: Array<CharSequence> = getInput()
    val bankAccount = BankAccount(input[0], input[1], input[2])
    val output: CharSequence =
        "Informacoes:\r\nConta: ${bankAccount.accountNumber}\r\nTitular: ${bankAccount.owner}\r\nSaldo: R$ ${bankAccount.balance}"
    OutputStreamWriter(System.out).append(output).close()
}