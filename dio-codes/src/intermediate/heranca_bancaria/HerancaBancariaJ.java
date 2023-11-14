package intermediate.heranca_bancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HerancaBancariaJ {
    private static CharSequence[] getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CharSequence[] input = {reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine()};
        reader.close();
        return input;
    }

    private static class BankAccount {
        CharSequence owner, accountNumber, balance;

        BankAccount(CharSequence owner, CharSequence accountNumber, CharSequence balance) {
            this.owner = owner;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    private static class SavingsAccount extends BankAccount {
        CharSequence interestRate;

        SavingsAccount(CharSequence owner, CharSequence accountNumber, CharSequence balance, CharSequence interestRate) {
            super(owner, accountNumber, balance);
            this.interestRate = interestRate;
        }
    }

    public static void main(String[] args) throws IOException {
        CharSequence[] input = getInput();
        SavingsAccount savingsAccount = new SavingsAccount(input[0], input[1], input[2], input[3]);
        CharSequence output = "Conta Poupanca:\r\n" + savingsAccount.owner + "\r\n" + savingsAccount.accountNumber + "\r\nSaldo: R$ " + savingsAccount.balance + "\r\nTaxa de juros: " + savingsAccount.interestRate + "%";
        new OutputStreamWriter(System.out).append(output).close();
    }
}