package application;

import entities.ContaEmpresa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaEmpresa conta1 = new ContaEmpresa();
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.deposito(10.0));
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.sacar(2.0));
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.sacar(-100.0));

        sc.close();
    }
}
