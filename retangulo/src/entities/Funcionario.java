package entities;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double imposto;

    public double SalarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double aumento){

        this.salarioBruto = (salarioBruto) * (1 + (aumento / 100));

        System.out.println("Salario aumentado com sucesso!");
    }

    public String toString(){
        return "\nFUncionario: " + name + ", salario: " + SalarioLiquido();
    }
}
