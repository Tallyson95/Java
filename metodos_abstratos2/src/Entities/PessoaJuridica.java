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
}
