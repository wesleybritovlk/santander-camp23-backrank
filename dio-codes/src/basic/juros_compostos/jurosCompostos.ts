import reader from "readline-sync"

function calcTime(rate: number, time: number): number {
    let result = 1.0
    for (let i = time; i > 0; --i) result *= rate
    return result
}

function main() {
    let input = [reader.question(), reader.question(), reader.question()]
    let principal = parseInt(input[0], 10)
    let time = parseInt(input[2], 10)
    let rate = 1 + parseFloat(input[1])
    let amount = principal * calcTime(rate, time)
    let output = `Valor final do investimento: R$ ${amount.toFixed(2)}`
    console.log(output)
}

main()