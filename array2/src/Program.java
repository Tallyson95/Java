import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numProds = sc.nextInt();
        sc.nextLine();

        Produto[] vet = new Produto[numProds];
        for(int i = 0; i < numProds; i++){
           String nome = sc.nextLine();
           double preco = sc.nextDouble();

           sc.nextLine();

           vet[i] = new Produto(nome, preco);

        }
        double soma = 0.0;

        for(int j = 0; j < numProds; j++){
            soma += vet[j].getPreco();
        }
        System.out.printf("a media é: %.2f", soma/numProds);


        sc.close();
    }
}
