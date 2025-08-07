package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

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
        System.out.println("-----------------------------------");

        Conta contaNormal1 = new Conta(1001, "Alex", 0.0);
        ContaEmpresa contaEmpresa1 = new ContaEmpresa(1002, "Pitibulls do samba",
                0.0, 500.0);

        System.out.println("UPCASTING");
        Conta contaNormal2 = contaEmpresa1;
        Conta contaNormal3 = new ContaEmpresa(1003, "qualquer", 0.0, 0.0);
        Conta contaNormal4 = new ContaPoupanca(1004, "Ana", 0.0, 0.5);

        System.out.println("DOWNCASTING");

        ContaEmpresa contaEmpresa2 = (ContaEmpresa) contaNormal1;
        //ContaEmpresa contaEmpresa3 = (ContaEmpresa)contaNormal4;
        if(contaNormal4 instanceof ContaEmpresa){
            ContaEmpresa contaEmpresa3 = (ContaEmpresa)contaNormal4;
        }

        sc.close();
    }
}
