import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                mat [i][j]= sc.nextInt();
            }
        }

        sc.close();
    }
}