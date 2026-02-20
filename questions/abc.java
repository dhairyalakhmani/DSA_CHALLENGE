import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 4
        printPattern(n);
    }

    public static void printPattern(int n) {
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                int top = i;
                int left = j;
                int right = size - j + 1;
                int bottom = size - i + 1;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
                int num = n - minDist + 1;

                if (num <= 0) {
                    System.out.print("_ ");
                } else if (num > n) {
                    System.out.print("_ ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
