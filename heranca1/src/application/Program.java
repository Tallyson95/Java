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

        Conta acc = new Conta(1000, "tallyson", 0.0);
        acc.deposito(800.0);
        System.out.println(acc.getSaldo());
        acc.sacar(100.0);
        System.out.println(acc.getSaldo());

        System.out.println("Sem desconto no deposito");
        ContaPoupanca accP = new ContaPoupanca(1001, " tallyson", 800.0, 0.1);
        System.out.println(accP.getSaldo());
        accP.sacar(100.0);
        System.out.println(accP.getSaldo());
        System.out.println("Testando uso do metodo de sacar da superclasse com super");
        ContaEmpresa accEmp = new ContaEmpresa(1003, "tallyson", 1000.0, 500.0);
        System.out.println(accEmp.getSaldo());
        accEmp.sacar(200.0);
        System.out.println(accEmp.getSaldo());

        ContaEmpresa conta1 = new ContaEmpresa();
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.deposito(10.0));
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.sacar(2.0));
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.sacar(-100.0));
        System.out.println("-----------------------------------");

        Conta contaNormal1 = new Conta(1001, "Alex", 0.0);
        ContaEmpresa contaEmpresa1 = new ContaEmpresa(1002, "Bruno",
                0.0, 500.0);

        System.out.println("UPCASTING");
        Conta contaNormal2 = contaEmpresa1;
        Conta contaNormal3 = new ContaEmpresa(1003, "qualquer", 0.0, 0.0);
        Conta contaNormal4 = new ContaPoupanca(1004, "Ana", 0.0, 0.5);

        System.out.println("DOWNCASTING");

        //ContaEmpresa contaEmpresa3 = (ContaEmpresa)contaNormal4;
        if(contaNormal4 instanceof ContaEmpresa){
            ContaEmpresa contaEmpresa3 = (ContaEmpresa)contaNormal4;
        }

        sc.close();
    }
}
