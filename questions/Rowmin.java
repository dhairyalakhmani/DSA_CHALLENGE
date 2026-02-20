import java.util.*;
import java.lang.Math;
public class Rowmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j=0; j < m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            int min=Integer.MAX_VALUE;
            for(int j=0; j < m; j++){
                min=Math.min(arr[i][j],min);
            }
            System.out.print(min+" ");
        }

    }
}