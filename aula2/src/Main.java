import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Digite aqui o seu texto: ");
        Scanner sc = new Scanner(System.in);
        int numb;
        numb = sc.nextInt();
        sc.nextLine();
        String valorUSer = sc.nextLine();
        System.out.println(numb);
        System.out.println(valorUSer);

        System.out.println("DIgite o numero inteiro: ");
        Double valorInt = sc.nextDouble();
        System.out.println(valorInt);

        sc.close();
    }
}