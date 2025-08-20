package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(new ContaEmpresa(1000, "tallyson", 500.0, 20.0));
        contas.add(new ContaPoupanca(1001, "Anelise", 1000.0, 50.0));
        contas.add(new ContaEmpresa(1002, "Thalyta", 500.0, 20.0));
        contas.add(new ContaPoupanca(1003, "Vitoria", 1000.0, 50.0));
        Double soma = 0.0;
        for (Conta elements : contas){
            soma += elements.getSaldo();
        }
        System.out.println("Soma de saldos: " + soma);
        for (Conta elements : contas){
            elements.deposito(10.0);
        }
        for (Conta elements : contas){
            System.out.println(elements.getSaldo());
        }

        sc.close();
    }
}
