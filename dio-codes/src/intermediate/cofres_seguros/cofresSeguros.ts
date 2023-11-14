import reader from "readline-sync"

abstract class Vault {
    static instanceOf = (type: string): Vault => (type === "digital") ? new VaultDigital() : new VaultPhysic()

    abstract open(type: string, pass: string, confirmPass: string): string;
}

class VaultDigital implements Vault {
    open = (_type: string, pass: string, confirmPass: string) => this.validatePass(pass, confirmPass) ? "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nCofre aberto!" : "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nSenha incorreta!"
    private validatePass = (pass: string, confirmPass: string) => pass === confirmPass
}

class VaultPhysic implements Vault {
    open = (_tipo: string) => "Tipo: Cofre Fisico\r\nMetodo de abertura: Chave"
}

function main() {
    let input = [reader.question(), reader.question(), reader.question()]
    let vault: Vault = Vault.instanceOf(input[0])
    let output = vault.open(input[0], input[1], input[2])
    console.log(output)
}

main()