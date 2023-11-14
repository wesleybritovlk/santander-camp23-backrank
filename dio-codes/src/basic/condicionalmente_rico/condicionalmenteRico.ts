import reader from "readline-sync"

const getOutput = (final: number) => final >= 0 ? `Saque realizado com sucesso. Novo saldo: ${final}`
    : "Saldo insuficiente. Saque nao realizado!";

function main() {
    let input = [reader.question(), reader.question()]
    let balance = parseInt(input[0], 10)
    let withdrawal = parseInt(input[1], 10)
    let finalValue = balance - withdrawal
    let output = getOutput(finalValue);
    console.log(output)
}

main()