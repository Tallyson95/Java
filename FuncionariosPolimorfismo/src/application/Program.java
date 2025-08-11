package application;

import entities.Employee;
import entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<Employee>();

        System.out.println("Entre com o numero de funcionarios: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario" + " #" + (i+1));
            System.out.println("É terceirizado?: (Y/N)");
            String opt = sc.nextLine().toUpperCase();

            String name;
            int hours;
            double valuePerHour;
            double add;
            if(opt.equals("Y")){
                System.out.println("Nome:");
                name = sc.nextLine();

                System.out.println("Horas:");
                hours = sc.nextInt();

                sc.nextLine();

                System.out.println("Valor da hora:");
                valuePerHour = sc.nextDouble();

                sc.nextLine();

                System.out.println("Valor do adicional:");
                add = sc.nextDouble();
                sc.nextLine();

                Employee outSourceEmployee = new OutSourceEmployee(
                        name,
                        hours,
                        valuePerHour,
                        add
                );
                employees.add(outSourceEmployee);
            }else{
                System.out.println("Nome:");
                name = sc.nextLine();
                System.out.println("Horas:");
                hours = sc.nextInt();
                sc.nextLine();
                System.out.println("Valor da hora:");
                valuePerHour = sc.nextDouble();
                sc.nextLine();

                Employee employee = new Employee(
                        name,
                        hours,
                        valuePerHour
                );
                employees.add(employee);
            }
        }
        for(Employee elements : employees){
            System.out.println(elements.payment());
        }
        sc.close();
    }
}
