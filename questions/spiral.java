import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int spiral[][] = new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int num=1;
        while(num<=n*n){
            for(int i=left; i<=right && num<=n*n; i++){
                spiral[top][i]=num;
                num++;
            }
            top++;
            for(int i=top; i<=bottom && num<=n*n; i++){
                spiral[i][right]=num;
                num++;
            }
            right--;
            for(int i=right; i>=left && num<=n*n; i--){
                spiral[bottom][i]=num;
                num++
            }
            bottom--;
            for(int i=bottom; i>=top && num<=n*n; i--){
                spiral[i][left]=num;
                num++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(spiral[i][j]);
            }
            System.out.println();
        }
    }
}
