package entities;

public class ContaEmpresa extends Conta{
    private Double limiteEmprestimo;
    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo){
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public boolean emprestimo(Double valorEmprestimo){
        if(valorEmprestimo == null || valorEmprestimo <= 0) return false;

        if(valorEmprestimo <= limiteEmprestimo){
            deposito(valorEmprestimo);
            this.saldo = (this.saldo + valorEmprestimo) - 10;
            return true;
        }
        return false;

    }
}
