package Entities;

public class PessoaFisica extends Contribuinte {
    private Double gastoSaude =  0.0;

    public PessoaFisica(){}
    public PessoaFisica(String name, Double rendaAnual, Double gastoSaude){
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto(){

        double imposto = 0.0;
        if (rendaAnual < 20000){
            imposto = (rendaAnual * 0.15) - (gastoSaude * 0.5);
            return imposto < 0 ? 0.0 : imposto;
        }else{
            imposto = (rendaAnual * 0.25) - (gastoSaude * 0.5);
            return imposto < 0 ? 0.0 : imposto;
        }
    }
}
