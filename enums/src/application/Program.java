package application;
import entities.classes.Order;
import entities.enums.OrderStatus;
import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Order> myList = new ArrayList<Order>();

        System.out.println("aaaw10");
        Order orderObj = new Order(123, new Date(), OrderStatus.PENDENTE);
        System.out.println(orderObj.toString());
        int i = 0;
        for(i = i ; i < 10; i++){
            myList.add(new Order(i+1, new Date(), i < 5 ? OrderStatus.PENDENTE : OrderStatus.PROCESSANDO));
        }

        for(int j = i ; j < 20; j++){
            myList.add(new Order(j+1, new Date(), j < 15 ? OrderStatus.ENVIADO : OrderStatus.ENTREGUE));
        }

        for(Order elements : myList){
            System.out.println(elements);
        }
        sc.close();
    }
}
