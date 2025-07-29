package entities;

public class Conta {
    private Integer numero;
    private String titular;
    private static Double saldoInicial = 0.0;
    private Double saldo = saldoInicial;


    public Conta(){}

    public Conta(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean sacar(Double valor){
        if(valor == null || valor <=0) return false;

        if(saldo - valor >= 0.0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean deposito(Double valor){
        if(valor == null || valor <=0) return false;
        this.saldo += valor;
        return true;
    }
}
