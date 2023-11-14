import reader from "readline-sync"

const getOutput = (deposit: string) =>
    deposit.at(0) === '-' ? "Valor invalido! Digite um valor maior que zero."
        : deposit.at(0) === '0' ? "Encerrando o programa..."
            : `Deposito realizado com sucesso!\r\nSaldo atual: R$ ${deposit}`;

function main() {
    let deposit = reader.question()
    let output = getOutput(deposit);
    console.log(output)
}

main()