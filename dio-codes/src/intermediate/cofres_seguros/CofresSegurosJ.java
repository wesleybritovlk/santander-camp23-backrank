package intermediate.cofres_seguros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CofresSegurosJ {
    private static String[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 30);
        String[] input = {reader.readLine(), reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private interface Vault {
        static Vault instanceOf(String type) {
            return type.equals("digital") ? new VaultDigital() : new VaultPhysic();
        }

        String open(String type, String pass, String confirmPass);
    }

    private static class VaultDigital implements Vault {
        public String open(String type, String pass, String confirmPass) {
            return validatePass(pass, confirmPass) ?
                    "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nCofre aberto!"
                    : "Tipo: Cofre Digital\r\nMetodo de abertura: Senha\r\nSenha incorreta!";
        }

        private static boolean validatePass(String pass, String confirmPass) {
            return pass.equals(confirmPass);
        }
    }

    private static class VaultPhysic implements Vault {
        public String open(String type, String pass, String confirmPass) {
            return "Tipo: Cofre Fisico\r\nMetodo de abertura: Chave";
        }

    }

    public static void main(String[] args) throws IOException {
        String[] input = getInput();
        Vault vault = Vault.instanceOf(input[0]);
        CharSequence output = vault.open(input[0], input[1], input[2]);
        new OutputStreamWriter(System.out).append(output).close();
    }
}