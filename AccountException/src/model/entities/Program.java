package model.entities;

import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            Account conta = new Account(
                    1010,
                    "Tallyson",
                    100.00,
                    750.00);

            conta.deposit(300.00);

            System.out.println(conta.getBalance());
            conta.deposit(1200.00);
            System.out.println(conta.getBalance());
            conta.withDraw(3000.00);
        } catch (Exception e) {
            throw new DomainException(e.getMessage());
        }

        sc.close();
    }
}
