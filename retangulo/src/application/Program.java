package application;

import entities.Aluno;
import entities.ConversorDolar;
import entities.Funcionario;
import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo objX = new Retangulo();
        /*System.out.println("Entre com a altura do retangulo: ");
        objX.altura = sc.nextDouble();

        System.out.println("Entre com a largura do retangulo: ");
        objX.largura = sc.nextDouble();

        System.out.printf("A area do retangulo é: %.2f", objX.AreaRetangulo());

        System.out.printf("\nO perímetro do retangulo é: %.2f\n", objX.Perimetro());

        System.out.printf("A diagonal do retangulo é: %.2f", objX.Diagonal());
        Funcionario programador = new Funcionario();
        programador.name = "Tallyson";

        programador.salarioBruto = 6000;
        programador.imposto = 1000;
        System.out.println(programador.SalarioLiquido());

        programador.aumentarSalario(10);
        System.out.println(programador);*/
        Aluno alun = new Aluno();
        alun.av1 = 15;
        alun.av2 = 3;
        alun.av3 = 15;
        System.out.println(alun.notaFinal());

        System.out.println(ConversorDolar.converterDolar(3.10, 200));


    }
}
