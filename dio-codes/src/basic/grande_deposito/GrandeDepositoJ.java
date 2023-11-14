package basic.grande_deposito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GrandeDepositoJ {
    private static CharSequence getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 15);
        CharSequence input = reader.readLine();
        reader.close();
        return input;
    }

    private static CharSequence getOutput(CharSequence deposit) {
        return deposit.charAt(0) == '-' ? "Valor invalido! Digite um valor maior que zero."
                : deposit.charAt(0) == '0' ? "Encerrando o programa..."
                : "Deposito realizado com sucesso!\r\nSaldo atual: R$ " + deposit;
    }

    public static void main(String[] args) throws IOException {
        CharSequence deposit = getInput();
        CharSequence output = getOutput(deposit);
        new OutputStreamWriter(System.out).append(output).close();
    }
}