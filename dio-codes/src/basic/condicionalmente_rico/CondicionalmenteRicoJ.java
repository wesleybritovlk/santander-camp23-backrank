package basic.condicionalmente_rico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CondicionalmenteRicoJ {
    private static CharSequence[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 20);
        CharSequence[] input = {reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private static int parse(CharSequence csq) {
        int result = 0;
        for (int radix = 10, length = csq.length(), i = 0; i < length; ++i) {
            int digit = Character.digit((int) csq.charAt(i), radix);
            result = result * radix;
            result = result - digit;
        }
        return -result;
    }

    private static String getOutput(int finalValue) {
        return finalValue >= 0 ? "Saque realizado com sucesso. Novo saldo: " + finalValue
                : "Saldo insuficiente. Saque nao realizado!";
    }

    public static void main(String[] args) throws IOException {
        CharSequence[] input = getInput();
        int balance = parse(input[0]),
                withdrawal = parse(input[1]),
                finalValue = balance - withdrawal;
        CharSequence output = getOutput(finalValue);
        new OutputStreamWriter(System.out).append(output).close();
    }
}