import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        List<String> myList = new ArrayList<String>();
        myList.add("TALLYSON");
        myList.add("ANELISE");
        myList.add("THALYTA");
        myList.add("VITÓRIA");
        myList.add("SOPHIA");
        myList.add("LUNA");
        myList.add(2, "TATIANA");
        myList.add("teda");

        System.out.println("----------------- LISTA 1: ");
        for(String elements : myList){
            System.out.println(elements);
        }


        //myList.removeIf(item -> item.toUpperCase().charAt(0) == 'T');
        List <String> filtroA = myList.stream().filter(item -> item.charAt(0) == 'A').collect(Collectors.toList());


        System.out.println("------------------ LISTA 2: ");
        for(String elements : filtroA){

            System.out.println(elements);
        }

        String nome = myList.stream().filter(item -> item.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(nome);
    }


}
