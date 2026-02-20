import java.util.ArrayList;

public class alldiag {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };

    int row = 0;
    for (int col = 0; col < arr[0].length; col++) {
      ArrayList<Integer> list = printentireDiagonal(row, col, arr);
      System.out.println(list);
    }

    int c = arr[0].length - 1;
    for (int r = 1; r < arr.length; r++) {
      ArrayList<Integer> list = printentireDiagonal(r, c, arr);
      System.out.println(list);
    }
  }

  static ArrayList<Integer> printentireDiagonal(int i, int j, int[][] arr) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int N = arr.length;
    int M = arr[0].length;
    while (i < N && j >= 0) {
      list.add(arr[i][j]);
      i++;
      j--;
    }
    return list;
  }
}
