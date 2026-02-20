import java.util.*;

public class GOMXs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); 

        int count = 0;
        int lastPrinted = Integer.MAX_VALUE;

        for (int i = N - 1; i >= 0 && count < 3; i--) {
            if (arr[i] != lastPrinted) {
                System.out.print(arr[i] + " ");
                lastPrinted = arr[i];
                count++;
            }
        }
    }
}
