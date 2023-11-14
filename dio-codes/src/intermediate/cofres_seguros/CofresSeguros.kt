package intermediate.cofres_seguros

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private fun getInput(): Array<String> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 30)
    val input = arrayOf(reader.readLine(), reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private fun interface Vault {
    companion object {
        fun instanceOf(tipo: String): Vault = if (tipo == "digital") VaultDigital() else VaultPhysic()
    }

    fun open(type: String, pass: String, confirmPass: String): String
}

private class VaultDigital : Vault {
    override fun open(type: String, pass: String, confirmPass: String): String =
        if (validatePass(pass, confirmPass)) "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nCofre aberto!"
        else "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nSenha incorreta!"

    private fun validatePass(pass: String, confirmPass: String): Boolean = pass == confirmPass
}

private class VaultPhysic : Vault {
    override fun open(type: String, pass: String, confirmPass: String): String =
        "Tipo: Cofre Fisico\r\nMetodo de abertura: Chave"
}

fun main() {
    val input = getInput()
    val vault: Vault = Vault.instanceOf(input[0])
    val output: CharSequence = vault.open(input[0], input[1], input[2])
    OutputStreamWriter(System.out).append(output).close()
}