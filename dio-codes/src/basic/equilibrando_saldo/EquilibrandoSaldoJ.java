package basic.equilibrando_saldo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EquilibrandoSaldoJ {
    private static CharSequence[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 25);
        CharSequence[] input = {reader.readLine(), reader.readLine(), reader.readLine()};
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

    public static void main(String[] args) throws IOException {
        CharSequence[] input = getInput();
        int balance = parse(input[0]),
                deposit = parse(input[1]),
                withdrawal = parse(input[2]),
                finalValue = balance + deposit - withdrawal;
        CharSequence output = "Saldo atualizado na conta: " + finalValue + ".0";
        new OutputStreamWriter(System.out).append(output).close();
    }
}