package twoPointersALGO;

public class vacation {
    public static void main(String[] args) {
        int[] temps = { -5, 6, 8, 10, 12, -7, -6 };
        int len = temps.length;
        int Q = 11, k = 3;
        int ways = 0;
        int left = 0, right = 0;
        while (right < len) {
            if (temps[left] > Q) {
                left++;
                right++;
            } else {
                while (temps[right] <= 11) {
                    right++;
                }
                len = right - left + 1;
                if (len >= 3)
                    ways++;
                left++;
                right=left;
            }
        }
        System.out.println(ways);
    }
}
