package entities;

public class ConversorDolar {
    public static double converterDolar(double dolar, double reais){
        double conversao =dolar * reais;
        return (conversao * 0.06) + conversao;
    }
}
