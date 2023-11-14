import reader from "readline-sync"

class BankAccount {
    constructor(readonly accountNumber: string, readonly owner: string, readonly balance: string) {
    }
}

function main() {
    let input: string[] = [reader.question(), reader.question(), reader.question()]
    let bankAccount = new BankAccount(input[0], input[1], input[2])
    let output: string = `Informacoes:\r\nConta: ${bankAccount.accountNumber}\r\nTitular: ${bankAccount.owner}\r\nSaldo: R$ ${bankAccount.balance}`
    console.log(output)
}

main()