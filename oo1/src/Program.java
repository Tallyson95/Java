import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();
        
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n1: ");
        n1 = sc.nextInt();
        System.out.println("Digite o valor de n2: ");
        n2 = sc.nextInt();
        System.out.println("Digite o valor de n3: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("O maior numero é: $d", n1);
        } else {
            if (n2 > n1 && n2 > n3) {
                System.out.printf("O maior numero é: %d", n2);
            } else {
                System.out.printf("O maior numero é: %d", n3);
            }
        }
        sc.close();
    }

}
