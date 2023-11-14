package intermediate.reuniao_acionistas

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate

private fun getInput(): Array<String> {
    val reader = BufferedReader(InputStreamReader(System.`in`), 30)
    val input = arrayOf(reader.readLine(), reader.readLine())
    reader.close()
    return input
}

private class Review(date: CharSequence, val description: CharSequence) {
    var date: LocalDate

    init {
        this.date = LocalDate.parse(date)
    }
}

private class ShareholderSystem {
    private val reviews: Array<Review> = arrayOf(
        Review("2023-01-01", "Analise de Desempenho Financeiro"),
        Review("2023-02-15", "Analise de Riscos e Exposicoes"),
        Review("2023-03-31", "Analises Corporativas"),
        Review("2023-04-01", "Analise de Politicas e Regulamentacoes"),
        Review("2023-05-15", "Analise de Ativos"),
        Review("2023-06-30", "Analise de Inovacao e Tecnologia")
    )

    fun parseDate(s: String): LocalDate =
        LocalDate.parse("${s.substring(6, 10)}-${s.substring(3, 5)}-${s.substring(0, 2)}")

    fun getPerformanceAnalysis(
        initialDate: LocalDate,
        finalDate: LocalDate
    ): CharSequence {
        val initialAnalysis = reviews.find { review ->
            review.date.monthValue >= initialDate.monthValue && review.date.dayOfMonth >= initialDate.dayOfMonth
        }?.description
        val finalAnalysis = reviews.find { review ->
            review.date.monthValue == finalDate.monthValue && review.date.dayOfMonth <= finalDate.dayOfMonth
        }?.description
        return "${initialAnalysis ?: ""}\r\n${finalAnalysis ?: ""}"
    }
}

fun main() {
    val input = getInput()
    val shareholderSystem = ShareholderSystem()
    val initialDate = shareholderSystem.parseDate(input[0])
    val finalDate = shareholderSystem.parseDate(input[1])
    val output = shareholderSystem.getPerformanceAnalysis(initialDate, finalDate)
    OutputStreamWriter(System.out).append(output).close()
}