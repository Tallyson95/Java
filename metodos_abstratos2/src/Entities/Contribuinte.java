package Entities;

public abstract class Contribuinte {
    String name;
    Double rendaAnual;

    public Contribuinte(){}

    public Contribuinte(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract Double imposto();

    public abstract String toString();
}
