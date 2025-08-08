package entities;

public class ContaPoupancaPlus extends ContaPoupanca{
    private static Double investimentoInicial = 0.0;
    private Double investimento;

    public ContaPoupancaPlus(){
        super();
    }
    public ContaPoupancaPlus(Integer numero, String titular, Double saldo, Double taxaJuros, Double investimento){
        super(numero, titular, saldo, taxaJuros);
        this.investimento = investimento;
    }
}
