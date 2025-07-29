package entities;

public class Produto {
    private String name;
    private double preco;
    private int quant;

    public Produto(String name, double preco, int quant){
        this.name = name;
        this.preco = preco;
        this.quant = quant;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQUant(){
        return this.quant;
    }

    public double valorTotalEstoque(){
        return preco * quant;
    }

    public void addQuant(int quant){
        this.quant += quant;
    }

    public void removerQuant (int quant){

        this.quant -= quant;
    }

    public String toString(){
        return "AUUUUUUUUU LATE CORAÇÃO CACHORRO LATE CORAÇÃO" + "\nproduto: " + name + ", preço: " + preco + ", quantidade:" + quant;
    }
}
