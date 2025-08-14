package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<Product>();
        
        System.out.println("Entre com o numero de produtos: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Produto comum, importado ou usado?: [ c, i, u ]");
            String type = sc.nextLine().toUpperCase();

            System.out.println("Nome do produto #" + (i+1));
            String name = sc.nextLine();

            System.out.println("Preço do produto #" + (i+1));
            double price = sc.nextDouble();
            sc.nextLine();

            if(type.equals("U")){
                System.out.println("Data de fabricação?: (DD/MM/YYYY)");
                String dataStr = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataStr, formatter);
                Date dataConvertida = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                products.add(new UsedProduct(name, price, dataConvertida));
            } else if (type.equals("I")) {
                System.out.println("Custo de importação?: ");
                double customFee = sc.nextDouble();
                sc.nextLine();
                products.add(new ImportedProduct(name, price, customFee));
            }else {
                products.add(new Product(name, price));
            }
        }

        for(Product elements : products){
            System.out.println(elements.priceTag());
        }
        sc.close();
    }
}
