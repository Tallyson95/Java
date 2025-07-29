import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();
        LocalDate data4 = LocalDate.parse("2025-11-17");
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);







        sc.close();
    }
}
