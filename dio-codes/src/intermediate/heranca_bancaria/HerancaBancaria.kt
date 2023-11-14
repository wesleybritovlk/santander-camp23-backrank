package intermediate.heranca_bancaria

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<CharSequence> {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val input: Array<CharSequence> = arrayOf(reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private open class BankAccount(
    open val owner: CharSequence, open val accountNumber: CharSequence, open val balance: CharSequence
)

private class SavingsAccount(
    override val owner: CharSequence,
    override val accountNumber: CharSequence,
    override val balance: CharSequence,
    val interestRate: CharSequence
) : BankAccount(owner, accountNumber, balance)

fun main() {
    val input: Array<CharSequence> = getInput()
    val savingsAccount = SavingsAccount(input[0], input[1], input[2], input[3])
    val output: CharSequence =
        "Conta Poupanca:\r\n${savingsAccount.owner}\r\n${savingsAccount.accountNumber}\r\nSaldo: R\$ ${savingsAccount.balance}\r\nTaxa de juros: ${savingsAccount.interestRate}%"
    OutputStreamWriter(System.out).append(output).close()
}