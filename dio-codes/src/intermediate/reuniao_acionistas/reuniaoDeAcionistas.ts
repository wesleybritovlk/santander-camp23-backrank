import reader from "readline-sync"

class Review {
    readonly _date: Date

    constructor(date: string, readonly _description: string) {
        this._date = new Date(`${date}T03:00:00.000Z`)
    }
}

class ShareholderSystem {
    private readonly _reviews: Review[] = [
        new Review("2023-01-01", "Analise de Desempenho Financeiro"),
        new Review("2023-02-15", "Analise de Riscos e Exposicoes"),
        new Review("2023-03-31", "Analises Corporativas"),
        new Review("2023-04-01", "Analise de Politicas e Regulamentacoes"),
        new Review("2023-05-15", "Analise de Ativos"),
        new Review("2023-06-30", "Analise de Inovacao e Tecnologia")
    ]
    parseDate = (s: string): Date => new Date(`${s.substring(6, 10)}-${s.substring(3, 5)}-${s.substring(0, 2)}T03:00:00.000Z`)

    getPerformanceAnalysis(initialDate: Date, finalDate: Date): string {
        let initialAnalysis = this._reviews.find(review =>
            review._date.getMonth() >= initialDate.getMonth() && review._date.getDate() >= initialDate.getDate()
        )?._description
        let finalAnalysis = this._reviews.find(review =>
            review._date.getMonth() === finalDate.getMonth() && review._date.getDate() <= finalDate.getDate()
        )?._description
        return `${initialAnalysis ?? ""}\r\n${finalAnalysis ?? ""}`
    }
}

function main() {
    let input = [reader.question(), reader.question()]
    let shareholderSystem = new ShareholderSystem()
    let initialDate = shareholderSystem.parseDate(input[0])
    let finalDate = shareholderSystem.parseDate(input[1])
    let output = shareholderSystem.getPerformanceAnalysis(initialDate, finalDate)
    console.log(output)
}

main()