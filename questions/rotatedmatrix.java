import java.util.Scanner;

public class rotatedmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matrix =
        {{1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
        }
        int [][]transpose=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0, end = arr[i].length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }

}

