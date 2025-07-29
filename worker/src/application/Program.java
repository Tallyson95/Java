package application;

import entities.Contrato;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.LevelFuncionario;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do departamento: ");
        Departamento objDepartamento = new Departamento(sc.nextLine());

        System.out.println("Nome do funcionario: ");
        String nomeUSer = sc.nextLine();
        System.out.println("Senioridade: ");
        LevelFuncionario levelUser = definirLevel(sc.nextLine());
        System.out.println("Salário base: ");
        Double salarioBaseUSer = sc.nextDouble();
        sc.nextLine();
        Funcionario funcionario = new Funcionario(nomeUSer, levelUser, salarioBaseUSer, objDepartamento.getNomeDepartamento());
        System.out.println("Quantos contratos? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Funcionario " + funcionario.getNome() + " - CONTRATO [" + (i+1) + "]: ");
            System.out.println("Data do contrato [" +(i+1) + "]: ");
            String dataStr = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataStr, formatter);
            Date dataConvertida = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            System.out.println("Valor por hora do contrato [" +(i+1) + "]: ");
            Double valorHora = sc.nextDouble();

            System.out.println("Duração em horas do contrato [" + (i+1) + "]: ");
            int horas = sc.nextInt();
            sc.nextLine(); // <-- limpa o buffer do teclado (consome o \n que sobrou)



            Contrato contrato = new Contrato(dataConvertida, valorHora, horas);
            funcionario.addContrato(contrato);
        }
        System.out.print("Entre com o mês (MM): ");
        int mes = sc.nextInt();
        System.out.print("Entre com o ano (YYYY): ");
        int ano = sc.nextInt();

        System.out.println("Nome: " + funcionario.getNome() + ", \nDepartamento: " + funcionario.getDepartamento() +
                ", \nLevel: " + funcionario.getLevel() + ", \nSalário: " + funcionario.getSalarioBase() +
                ", \nSalário + variável: " + funcionario.rendaTotal(mes, ano));

        sc.close();
    }
    public static LevelFuncionario definirLevel(String senioridade){
        LevelFuncionario level;
        if((senioridade.toUpperCase().equals("JUNIOR") )|| (senioridade.toUpperCase().equals("JÚNIOR"))){
            level = LevelFuncionario.JUNIOR;
        } else if (senioridade.toUpperCase().equals("PLENO")) {
            level = LevelFuncionario.PLENO;
        }else{
            level = LevelFuncionario.SENIOR;
        }
        return level;
    }
}
