package entities;

public class Item {
    private Integer quantidade;
    private Double preco;

    public Item(){
    }

    public Item(Integer quantidade, Double preco){
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double subTotal(){
        return preco * quantidade;
    }
}
