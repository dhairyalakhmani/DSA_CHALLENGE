package DSA_CHALLENGE.BinarySearch;

import java.util.Arrays;

public class aggressiveCows {

    public static int minDistantCows(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int left = 1;
        int right = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (checkDistance(stalls, cows, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static boolean checkDistance(int[] arr, int cows, int distance) {
        int count = 1;
        int lastPlaced = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPlaced >= distance) {
                count++;
                lastPlaced = arr[i];
            }
            if (count == cows)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 9, 10};
        int cows = 3;
        System.out.println(minDistantCows(arr, cows));
    }
}

