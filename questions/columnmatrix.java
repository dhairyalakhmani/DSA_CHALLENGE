import java.util.Scanner;

public class ColumnMatrixOnTheFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] temp = new int[m][n]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[j][i] = sc.nextInt(); 
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(temp[j][i] + " ");
            }
        }
    }
}
