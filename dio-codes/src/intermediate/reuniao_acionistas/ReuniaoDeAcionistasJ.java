package intermediate.reuniao_acionistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.Arrays;

public class ReuniaoDeAcionistasJ {
    private static String[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 30);
        String[] input = {reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private static class Review {
        LocalDate data;
        String description;

        public Review(String date, String description) {
            this.data = LocalDate.parse(date);
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private static class ShareholderSystem {
        private final Review[] reviews = new Review[]{new Review("2023-01-01", "Analise de Desempenho Financeiro"),
                new Review("2023-02-15", "Analise de Riscos e Exposicoes"),
                new Review("2023-03-31", "Analises Corporativas"),
                new Review("2023-04-01", "Analise de Politicas e Regulamentacoes"),
                new Review("2023-05-15", "Analise de Ativos"),
                new Review("2023-06-30", "Analise de Inovacao e Tecnologia")};

        LocalDate parseDate(String s) {
            return LocalDate.parse(s.substring(6, 10) + "-" + s.substring(3, 5) + "-" + s.substring(0, 2));
        }

        String getPerformanceAnalysis(LocalDate dataInicial, LocalDate dataFinal) {
            String initialAnalysis = Arrays.stream(reviews).filter(review ->
                            review.data.getMonthValue() >= dataInicial.getMonthValue() && review.data.getDayOfMonth() >= dataInicial.getDayOfMonth())
                    .findAny().map(Review::getDescription).orElse("");
            String finalAnalysis = Arrays.stream(reviews).filter(review ->
                            review.data.getMonthValue() == dataFinal.getMonthValue() && review.data.getDayOfMonth() <= dataFinal.getDayOfMonth())
                    .findAny().map(Review::getDescription).orElse("");
            return initialAnalysis + "\r\n" + finalAnalysis;
        }
    }

    public static void main(String[] args) throws IOException {
        String[] input = getInput();
        ShareholderSystem shareholderSystem = new ShareholderSystem();
        LocalDate initialDate = shareholderSystem.parseDate(input[0]), finalDate = shareholderSystem.parseDate(input[1]);
        CharSequence output = shareholderSystem.getPerformanceAnalysis(initialDate, finalDate);
        new OutputStreamWriter(System.out).append(output).close();
    }
}