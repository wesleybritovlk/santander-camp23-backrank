package basic.juros_compostos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JurosCompostosJ {
    private static String[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 25);
        String[] input = {reader.readLine(), reader.readLine(), reader.readLine()};
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

    private static double calcTime(double rate, int time) {
        double result = 1;
        for (int i = time; i > 0; --i) result = result * rate;
        return result;
    }

    public static void main(String[] args) throws IOException {
        String[] input = getInput();
        int principal = parse(input[0]),
                time = parse(input[2]);
        double rate = 1 + Double.parseDouble(input[1]),
                amount = principal * calcTime(rate, time);
        CharSequence output = "Valor final do investimento: R$ %.2f".formatted(amount);
        new OutputStreamWriter(System.out).append(output).close();
    }
}