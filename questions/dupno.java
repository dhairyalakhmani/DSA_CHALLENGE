import java.util.Scanner;

public class dupno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }

        sc.close();
    }
}
