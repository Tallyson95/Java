import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];


        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.printf("%d ", mat[i][j]);;
            }
            System.out.println(" ");
        }

        System.out.printf("\n\n");
        int valor = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == valor){
                    System.out.printf("Posicao: %d, %d\n", i, j);
                    System.out.println("Esquerda: " + (j - 1 >= 0 ? mat[i][j-1] : "Posição invalida na matriz"));
                    System.out.println("Direita: " + (j + 1 < m ? mat[i][j+1] : "Posição invalida na matriz"));
                    System.out.println("Cima: "  + (i - 1 >= 0 ?  mat[i-1][j] : "Posição invalida na matriz"));
                    System.out.println("Baixo: " + (i+1 < n ? mat[i+1][j] : "Posição invalida na matriz"));
                }
            }
        }
        sc.close();
    }
}
