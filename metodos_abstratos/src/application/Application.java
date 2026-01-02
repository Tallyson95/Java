package application;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero de formas: ");
        int x = sc.nextInt();
        sc.nextLine();
        ArrayList<Forma> arrayFormas = new ArrayList<Forma>();

        for(int i = 0; i < x; i++){
            System.out.println("Retangulo ou circulo?: [R / C]" );
            String tipoForma = sc.nextLine().toUpperCase();
            System.out.println("Escolha uma cor: [BLACK / BLUE / RED");
            String cor = sc.nextLine().toUpperCase();
            Color corFinal = definirCor(cor);
            if(tipoForma.equals("R")){
                System.out.println("Digite a largura do Retangulo: ");
                Double largura = sc.nextDouble();
                sc.nextLine();
                System.out.println("Digite a altura do Retangulo: ");
                Double altura = sc.nextDouble();
                sc.nextLine();
                arrayFormas.add(new Retangulo(largura, altura, corFinal));
            }else{
                if(tipoForma.equals("C")){
                    System.out.println("Digite o raio do circulo");
                    Double raio = sc.nextDouble();
                    sc.nextLine();
                    arrayFormas.add(new Circulo(raio, corFinal));
                }
            }
        }

        for(Forma elementos: arrayFormas){
            System.out.println(elementos.toString());
        }

        sc.close();
    }

    public static Color definirCor(String cor){
        Color value = Color.BLACK;
        switch (cor){
            case "BLACK":
                value = Color.BLACK;
                break;
            case "BLUE":
                value = Color.BLUE;
                break;
            case "RED":
                value = Color.RED;
                break;
        }
        return value;
    }
}
