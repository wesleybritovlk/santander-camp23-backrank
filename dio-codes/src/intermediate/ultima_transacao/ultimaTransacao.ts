import reader from "readline-sync"

class Transaction {
    constructor(readonly date: string, readonly hour: string, readonly description: string, readonly value: string) {
    }
}

function main() {
    let input: string[] = reader.question().split(',')
    let transaction = new Transaction(input[0], input[1], input[2], input[3])
    const output = `${transaction.description}\r\n${transaction.date}\r\n${transaction.hour}\r\n${transaction.value}`
    console.log(output)
}

main()