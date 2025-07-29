package application;


import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       /* tv.quant = 10;
        System.out.printf("Quantidade do produto atual: %d\n", tv.quant);
        tv.addQuant(5);
        System.out.printf("Quantidade do produto atual: %d", tv.quant);*/
        System.out.println("Entre com o nome do produto: ");
        String name = sc.nextLine();
        System.out.println("Entre com o preco: ");
        double preco = sc.nextDouble();
        System.out.println("Entre com a quantidade: ");
        int quant = sc.nextInt();

        Produto tv = new Produto(name, preco, quant);

        double totalEstoque = tv.valorTotalEstoque();
        System.out.printf("Valor total em estoque: %.2f, quantidade de produto: %d\n", totalEstoque, tv.getQUant());

        tv.addQuant(2);
        totalEstoque = tv.valorTotalEstoque();
        System.out.printf("Produto adicionado com sucesso! Total de %d produtos, preco total atualizado: %.2f", tv.getQUant(), totalEstoque);
        sc.nextLine();

        System.out.println("\nGostaria de remover um ou mais itens?: [Y / N]");

        String resp = sc.nextLine();

        resp = resp.toLowerCase();

        if(resp.equals("y")){
            System.out.println("Deseja remover quantos itens??: ");
            double numRemoveTemp = sc.nextDouble();
            int numRemove = (int) Math.floor(numRemoveTemp);
            System.out.println(numRemoveTemp);
            if((tv.getQUant() - numRemove) >= 0){
                tv.removerQuant(numRemove);
                System.out.printf("\n%d itens foram removidos do estoque!", numRemove);
                totalEstoque = tv.valorTotalEstoque();
                System.out.printf("\nTotal de %d itens no estoque, preco total atualizado: %.2f", tv.getQUant(), totalEstoque);
            }else{
                System.out.println("O numero de itens a ser removido é maior do que a quantidade em estoque, tente novamente");
            }

        }

        System.out.println("\nProduto: " + tv.getName() + ", preço total: " + tv.getName() + ", quantidade em estoque: " + tv.getName());

        System.out.println("\n");
        System.out.println(tv);

        System.out.println("Auterando o produto: ");
        tv.setName("playstation 5");
        System.out.printf("Alterado para %s", tv.getName());
        sc.close();
    }
}