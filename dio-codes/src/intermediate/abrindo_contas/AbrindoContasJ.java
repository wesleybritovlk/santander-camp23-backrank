package intermediate.abrindo_contas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AbrindoContasJ {
    private static String[] getStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 40);
        String[] input = {reader.readLine(), reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private static class BankAccount {
        CharSequence accountNumber, owner, balance;

        BankAccount(CharSequence accountNumber, CharSequence owner, CharSequence balance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
        }
    }

    public static void main(String[] args) throws IOException {
        String[] input = getStrings();
        BankAccount bankAccount = new BankAccount(input[0], input[1], input[2]);
        CharSequence output = "Informacoes:\r\nConta: " + bankAccount.accountNumber + "\r\nTitular: " + bankAccount.owner + "\r\nSaldo: R$ " + bankAccount.balance;
        new OutputStreamWriter(System.out).append(output).close();
    }
}