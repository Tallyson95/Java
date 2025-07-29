package entities;

import entities.enums.LevelFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Funcionario {
    private String nome;
    private LevelFuncionario level;
    private Double salarioBase;
    private String departamento;

    private List<Contrato> listContratos = new ArrayList<Contrato>();

    public Funcionario(String nome, LevelFuncionario level, Double salarioBase, String departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public LevelFuncionario getLevel() {
        return this.level;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void addContrato(Contrato contrato) {
        listContratos.add(contrato);
    }

    public void removerContrato(Contrato contrato){
        listContratos.remove(contrato);
    }

    public Double rendaTotal(int mes, int ano){
        Double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();

        for(Contrato elements : listContratos){
            calendario.setTime(elements.getData());
            int calendarioAno = calendario.get(Calendar.YEAR);
            int calendarioMes = 1 + calendario.get(Calendar.MONTH);
            if(calendarioMes == mes && calendarioAno == ano){
                soma += elements.valorTotal();
            }
        }
        return soma;
    }
}
