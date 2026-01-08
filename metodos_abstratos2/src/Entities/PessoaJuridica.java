package Entities;

public class PessoaJuridica extends Contribuinte{
    private Integer numeroFuncionarios = 0;
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto(){
        return numeroFuncionarios > 10 ? rendaAnual * 0.14 : rendaAnual * 0.16;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa Jurídica: ");
        sb.append(name);
        sb.append(" | Renda anual: ");
        sb.append(String.format("%.2f", rendaAnual));
        sb.append(" | Funcionários: ");
        sb.append(numeroFuncionarios);
        sb.append(" | Imposto: ");
        sb.append(String.format("%.2f", imposto()));
        return sb.toString();
    }

}
