package intermediate.ultima_transacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UltimaTransacaoJ {
    private static String[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 45);
        String[] input = reader.readLine().split(",");
        reader.close();
        return input;
    }

    private static class Transaction {
        CharSequence date, hour, description, value;

        Transaction(CharSequence date, CharSequence hour, CharSequence description, CharSequence value) {
            this.date = date;
            this.hour = hour;
            this.description = description;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        String[] input = getInput();
        Transaction transaction = new Transaction(input[0], input[1], input[2], input[3]);
        CharSequence output = transaction.description + "\r\n" + transaction.date + "\r\n" + transaction.hour + "\r\n" + transaction.value;
        new OutputStreamWriter(System.out).append(output).close();
    }
}