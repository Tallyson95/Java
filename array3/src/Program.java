import entities.AlugarQuarto;
import entities.Numeros;
import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*boolean numerosk = false;

        System.out.println("Entre com um numero: ");
        int n = sc.nextInt();
        if(numerosk){
            Numeros[] vet = new Numeros[n];

            for(int i = 0; i < n; i++){
                int valor = sc.nextInt();
                vet[i] = new Numeros(valor);

            }

            for(int j = 0; j < n; j++){
                if(vet[j].getValor() < 0){
                    System.out.println(vet[j].getValor  ());
                }
            }
        }else{
            Pessoas[] vet = new Pessoas[n];

            for(int i = 0; i < n; i++){
                System.out.println("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Idade: ");
                int idade = sc.nextInt();
                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                vet[i] = new Pessoas(nome, idade, altura);
            }

            double alturas = 0.0;
            int cont = 0;
            for(int j = 0; j < n; j++){
                alturas += vet[j].getAltura();
                if(vet[j].getIdade() < 16){
                    cont += 1;
                }

                if(j == (n -1)){
                    System.out.printf("Altura médias: %.2f\n", alturas/n );
                    System.out.printf("Pessoas com menos de 16 anos: %.2f\n", ((cont * 100.0) / n));
                }
                //System.out.printf("Nome: %s, idade: %d, altura: %.2f\n", vet[j].getNome(), vet[j].getIdade(), vet[j].getAltura());
            }

            for(int k = 0; k < n; k++){
                if(vet[k].getIdade() < 16){
                    System.out.println(vet[k].getNome());
                }
            }
        }*/

        AlugarQuarto pessoa1 = new AlugarQuarto("Tallyson", "tallyson@gmail.com");
        System.out.println(pessoa1.quartosDisponiveis());
        System.out.printf("%s, qual quarto você quer alugar?: ", pessoa1.getNomeInquilino());
        int num = sc.nextInt();
        System.out.println(pessoa1.alugarUmQUarto(num));    


        AlugarQuarto pessoa2 = new AlugarQuarto("Anelise", "anelise@gmail.com");
        System.out.println(pessoa2.quartosDisponiveis());
        System.out.printf("%s, qual quarto você quer alugar?: ", pessoa2.getNomeInquilino());
        int num2 = sc.nextInt();
        System.out.println(pessoa2.alugarUmQUarto(num2));

        sc.close();
    }
}
