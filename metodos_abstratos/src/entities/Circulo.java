package entities;

import entities.enums.Color;

public class Circulo extends Forma {
    private Double raio;

    public Circulo(){
        super();
    }

    public Circulo(Double raio, Color color){
        super(color);
        this.raio = raio;
    }

    @Override
    public Color getCor() {
        return super.getCor();
    }

    @Override
    public Double area(){
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Círculo { ");
        sb.append("Raio = ").append(raio);
        sb.append(", Cor = ").append(getCor());
        sb.append(", Área = ").append(area());
        sb.append(" }");
        return sb.toString();
    }

}
