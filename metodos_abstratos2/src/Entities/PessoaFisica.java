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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa Física: ");
        sb.append(name);
        sb.append(" | Renda anual: ");
        sb.append(String.format("%.2f", rendaAnual));
        sb.append(" | Gasto com saúde: ");
        sb.append(String.format("%.2f", gastoSaude));
        sb.append(" | Imposto: ");
        sb.append(String.format("%.2f", imposto()));
        return sb.toString();
    }

}
