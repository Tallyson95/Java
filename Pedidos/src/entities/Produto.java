package entities;

public class Produto {
    private String nomeProduto;
    private Double preco;

    public Produto(){}

    public Produto(String nomeProduto, Double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomePedido='" + nomeProduto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
