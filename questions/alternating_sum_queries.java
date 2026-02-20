import java.util.Scanner;

public class alternating_sum_queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

        int[] left = new int[q];
        int[] right = new int[q];
        for (int i = 0; i < q; i++) {
            left[i] = sc.nextInt() - 1;   // convert to 0-index
            right[i] = sc.nextInt() - 1;
        }

        long[] Psum = new long[n];
        Psum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) Psum[i] = Psum[i - 1] - arr[i];
            else Psum[i] = Psum[i - 1] + arr[i];
        }

        for (int i = 0; i < q; i++) {
            int L = left[i], R = right[i];
            long res;

            if (L == 0) res = Psum[R];
            else res = Psum[R] - Psum[L - 1];

            if (L % 2 == 1) res = -res;

            System.out.println(res);
        }
    }
}
