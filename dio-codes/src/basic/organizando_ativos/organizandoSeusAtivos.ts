import reader from "readline-sync"

function getInput() {
    reader.question()
    return [reader.question(), reader.question(), reader.question()];
}

function organize(input: string[]) {
    let sort1 = input[0].charAt(0) < input[1].charAt(0)
    let sort2 = input[0].charAt(0) < input[2].charAt(0)
    return sort1 ? `${input[0]}\r\n${input[2]}\r\n${input[1]}`
        : sort2 ? `${input[1]}\r\n${input[0]}\r\n${input[2]}`
            : `${input[1]}\r\n${input[2]}\r\n${input[0]}`
}

function main() {
    let input = getInput();
    let output = organize(input)
    console.log(output)
}

main()