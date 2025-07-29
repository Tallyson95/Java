package entities;

public class Funcionario {
    private int id;
    private String nome;
    private Double salario;
    private char sexo;

    public Funcionario(int id, String nome, Double salario, char sexo){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getSalario(){
        return this.salario;
    }

    public char getSexo(){
        return this.sexo;
    }
    public boolean aumentarSalario(Double porcentagem){

        if(porcentagem <= 0){
            return false;
        }

        this.salario = ((porcentagem / 100) * salario) + salario;
        return true;
    }
}
