import reader from "readline-sync"

function main() {
    let input = [reader.question(), reader.question(), reader.question()]
    let balance = parseInt(input[0], 10)
    let deposit = parseInt(input[1], 10)
    let withdrawal = parseInt(input[2], 10)
    let finalValue = balance + deposit - withdrawal
    let output = `Saldo atualizado na conta: ${finalValue}.0`
    console.log(output)
}

main()