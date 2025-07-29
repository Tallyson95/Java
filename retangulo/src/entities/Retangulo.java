package entities;

public class Retangulo {
    public double altura;
    public  double largura;

    public double AreaRetangulo(){
        return altura * largura;
    }

    public double Perimetro(){
        return 2 * (altura + largura);
    }

    public double Diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }
}
