import java.util.Scanner;

public class antidiag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
                if(i+j==(n-1))
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}