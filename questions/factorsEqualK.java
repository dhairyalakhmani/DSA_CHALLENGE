import java.util.*;

public class factorsEqualK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        int MAX = 100000;

        int[] div = new int[MAX + 1];

        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                div[j]++;
            }
        }

        int[] good = new int[N];
        for (int i = 0; i < N; i++) {
            if (div[A[i]] == K) good[i] = 1;
        }

        int[] prefix = new int[N];
        prefix[0] = good[0];
        for (int i = 1; i < N; i++) {
            prefix[i] = prefix[i - 1] + good[i];
        }

        while (Q-- > 0) {
            int L = sc.nextInt() - 1;
            int R = sc.nextInt() - 1;

            if (L == 0) {
                System.out.println(prefix[R]);
            } else {
                System.out.println(prefix[R] - prefix[L - 1]);
            }
        }
    }
}
