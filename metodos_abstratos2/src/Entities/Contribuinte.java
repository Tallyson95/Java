package Entities;

public abstract class Contribuinte {
    String name;
    Double rendaAnual;

    public Contribuinte(){}

    public Contribuinte(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();
}
