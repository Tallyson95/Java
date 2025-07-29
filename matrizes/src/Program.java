import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite o valor de N: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            System.out.println("DIgite os valores da linha: "+  (i+1) );
            for(int j = 0; j< n; j++){
                int valor = sc.nextInt();
                mat[i][j] = valor;
            }
        }

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    System.out.printf("%d ", mat[i][j]);
                }
            }
            System.out.println(" ");
        }
        System.out.println("\n");

        System.out.println("\nDiagonal secundária:");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", mat[i][n - 1 - i]);
        }

        System.out.printf("\n\n");
        int cont = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] < 0){
                    cont++;
                    System.out.printf("%d ", mat[i][j]);
                }
            }
        }
        System.out.printf("Total de números negativos: %d", cont);
    }
}
