public class vimal {
    public static void main(String[] args) {
        String big = "ADOBECODEBANC";
        String small = "ABC";
        Solution_ solution = new Solution_();
        System.out.println(solution.minWindow(big, small));
    }
}

class Solution_ {
    private int[] fB;
    private int[] fA;
    private String small;
    private String big;

    public String minWindow(String A, String B) {
        this.small = B;
        this.big = A;
        this.fA = new int[256];
        this.fB = new int[256];
        fill();
        int start = 0 , end = 0;
        int minLength = Integer.MAX_VALUE;
        int fStart = -1, fEnd = -1;
        while (end < big.length()) {
            char ch = A.charAt(end);
            fA[ch]++;
            while (isValid()) {
                int length = end - start + 1;
                if (length < minLength) {
                    minLength = length;
                    fStart = start;
                    fEnd = end;
                }
//                System.out.println("Inside : start: " + start + " end: " + end);
                fA[big.charAt(start)]--;
                start++;
            }
            end++;
//            System.out.println("start: " + start + " end: " + end);
        }
        if (fStart == -1 || fEnd == -1)
            return "a";
        return big.substring(fStart, fEnd + 1);
    }

    private void fill() {
        for (char ch : small.toCharArray())
            fB[ch]++;
    }

    private boolean isValid() {
        for (int i = 0; i < 256; i++)
            if (fA[i] < fB[i])
                return false;
        return true;
    }
}
