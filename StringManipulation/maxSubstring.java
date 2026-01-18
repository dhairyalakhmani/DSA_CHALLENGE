package DSA_CHALLENGE.StringManipulation;

import java.util.Arrays;

public class maxSubstring {

    public static void main(String[] args) {
        String str = "010111";
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.flip(str)));
    }

    static class Solution {
        public int[] flip(String A) {
            int n = A.length();
            int i = 0;
            // int index = 0;
            int count = 0;
            int zeroCount = 0;
            int OneCount = 0;
            int zeroStart = -1, zeroEnd = -1;
            int length;
            int maxLength = 0;
            int[] ans = new int[2];
            while (i < n) {
                count = 0;
                while (i < n && A.charAt(i) == '1') {
                    count++; // ones ka count
                    i++;
                }


                if (zeroCount > 0) {
                    length = count + zeroCount + OneCount;
                    if (length > maxLength) {
                        maxLength = length;
                        ans[0] = zeroStart + 1;
                        ans[1] = zeroEnd + 1;
                    }
                }
                OneCount = count;
                count = 0;
                if (i >= n) break;
                zeroStart = i;
                while (i < n && A.charAt(i) == '0') {
                    count++;
                    i++;
                }
                zeroEnd = i - 1;
                zeroCount = count;
            }
            if (zeroCount > 0) {
                length = zeroCount + OneCount;
                if (length > maxLength) {
                    maxLength = length;
                    ans[0] = zeroStart + 1;
                    ans[1] = zeroEnd + 1;
                }

            }
            return (zeroCount == 0) ? new int[0] : ans;
        }
    }

}