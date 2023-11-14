import reader from "readline-sync"

class BankAccount {
    constructor(readonly owner: string, readonly accountNumber: string, readonly balance: string) {
    }
}

class SavingsAccount extends BankAccount {
    constructor(owner: string, accountNumber: string, balance: string, readonly taxaJuros: string) {
        super(owner, accountNumber, balance)
    }
}

function main() {
    let input = [reader.question(), reader.question(), reader.question(), reader.question()]
    let contaPoupanca = new SavingsAccount(input[0], input[1], input[2], input[3])
    const output: string = `Conta Poupanca:\r\n${contaPoupanca.owner}\r\n${contaPoupanca.accountNumber}\r\nSaldo: R$ ${contaPoupanca.balance}\r\nTaxa de juros: ${contaPoupanca.taxaJuros}%`
    console.log(output)
}

main()