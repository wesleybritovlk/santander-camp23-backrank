package basic.organizando_ativos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OrganizandoSeusAtivosJ {
    private static CharSequence[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 85);
        reader.readLine();
        CharSequence[] input = {reader.readLine(), reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private static CharSequence organize(CharSequence[] ehtradas) {
        boolean sort1 = ehtradas[0].charAt(0) < ehtradas[1].charAt(0),
                sort2 = ehtradas[0].charAt(0) < ehtradas[2].charAt(0);
        return sort1 ? ehtradas[0] + "\r\n" + ehtradas[2] + "\r\n" + ehtradas[1]
                : sort2 ? ehtradas[1] + "\r\n" + ehtradas[0] + "\r\n" + ehtradas[2]
                : ehtradas[1] + "\r\n" + ehtradas[2] + "\r\n" + ehtradas[0];
    }

    public static void main(String[] args) throws IOException {
        CharSequence[] input = getInput();
        CharSequence output = organize(input);
        new OutputStreamWriter(System.out).append(output).close();
    }
}