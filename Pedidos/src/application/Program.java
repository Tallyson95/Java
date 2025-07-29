package application;

import entities.Cliente;
import entities.Item;
import entities.Pedido;
import entities.Produto;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Tallyson", "tallyson" +
                "95@gmail.com", "27031996");
        System.out.println("Quando itens gostaria de incluir no pedido? "
        + cliente1.getNome());
        int n = sc.nextInt();
        sc.nextLine();
        Pedido pedido = new Pedido(new Date());
        Double total = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Nome do produto " + (i+1));
            String nomeProduto = sc.nextLine();
            System.out.println("Preço do produto " + (i+1));
            Double precoProduto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantidade do produto " + (i+1));
            Integer quantidade = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);
            Item item = new Item (quantidade, precoProduto);




            System.out.println("Order items: ");
            System.out.println(produto.getNomeProduto() +
                    ", Quantity: " + item.getQuantidade() + ", " +
                    item.subTotal());
            total += item.subTotal();
        }
        System.out.println("Order sumary:");
        System.out.println("Order moment: " + pedido.getMomento());
        System.out.println("Client: " +
                cliente1.getNome() + " (" + cliente1.getDataDeNascimento() +
                ") - " + cliente1.getEmail());
        System.out.printf("Total price: %.2f", total);

        sc.close();
    }

}
