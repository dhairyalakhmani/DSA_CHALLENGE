import java.util.*;

public class GOMs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); // Sort in ascending order

        int count = 1;
        System.out.print(arr[0] + " "); // smallest
        for (int i = 1; i < N && count < 3; i++) {
            if (arr[i] != arr[i - 1]) { // ensure distinct
                System.out.print(arr[i] + " ");
                count++;
            }
        }
    }
}
