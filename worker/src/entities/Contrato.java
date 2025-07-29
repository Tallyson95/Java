package entities;

import java.util.Date;

public class Contrato {
    private Date data;
    private Double valorPorHora;
    private Integer horas;
    private Integer nextId = 10;

    public Contrato(Date data, Double valorPorHora, Integer horas){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public int getNextId() {
        return nextId++;
    }

    public Date getData(){
        return this.data;
    }

    public Double getValorPorHora(){
        return this.valorPorHora;
    }

    public Integer getHoras(){
        return horas;
    }

    public Double valorTotal(){
        return (Double) valorPorHora*horas;
    }


}
