public class primeNumbers {
    public static void main(String[] args) {
        int N = 6;
        int[] ans = new int[6];
        int c = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j == i / j)
                        count += 1;
                    else
                        count += 2;
                }
            }
            ans[c++] = count;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
