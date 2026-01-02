package entities;

import entities.enums.Color;

public class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo(){
        super();
    }

    public Retangulo(Double largura, Double altura, Color color){
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Color getCor() {
        return super.getCor();
    }

    @Override
    public Double area(){
        return largura * altura;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Retângulo { ");
        sb.append("Largura = ").append(largura);
        sb.append(", Altura = ").append(altura);
        sb.append(", Cor = ").append(getCor());
        sb.append(", Área = ").append(area());
        sb.append(" }");
        return sb.toString();
    }


}
