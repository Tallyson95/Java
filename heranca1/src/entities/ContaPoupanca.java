package entities;

public class ContaPoupanca extends Conta{
    private Double taxaJuros;
    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros){
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void autilizarSaldoTaxaJuros(){
        saldo += saldo * taxaJuros;
    }

    @Override
    public boolean sacar(Double valor){
        if(valor == null || valor <=0) return false;

        if(saldo - valor >= 0.0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
