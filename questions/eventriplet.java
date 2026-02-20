import java.util.Scanner;

public class EventTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                if (sum % 2 == 0) {
                    System.out.println("[" + arr[i][j] + "," + arr[i][j+1] + "," + arr[i][j+2] + "]");
                }
            }
        }
    }
}
