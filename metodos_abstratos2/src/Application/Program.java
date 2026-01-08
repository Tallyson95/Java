package Application;

import Entities.Contribuinte;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();
        System.out.println("Entre com o numero de pagadores: ");
        int x = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < x; i++){
            System.out.println("Tipo de conta?: CPF [i] ou CNPJ [c]");
            String opt = sc.nextLine().toUpperCase();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Renda anual?: ");
            Double rendaAnual = sc.nextDouble();
            sc.nextLine();
            if(opt.equals("I")){
                System.out.println("Gastos com saude?: ");
                Double gastoSaude = sc.nextDouble();
                sc.nextLine();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            }else{
                System.out.println("Numero de funcionarios na empresa?: ");
                int numFuncionarios = sc.nextInt();
                sc.nextLine();
                contribuintes.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            }
        }

        double total = 0.0;
        for(Contribuinte elementos : contribuintes){
            System.out.println(elementos.getName() + ": " + elementos.imposto());
            total += elementos.imposto();
        }
        System.out.println("Total de taxas:" + total);

        sc.close();
    }
}
