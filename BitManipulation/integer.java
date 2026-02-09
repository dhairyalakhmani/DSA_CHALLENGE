package DSA_CHALLENGE.BitManipulation;

public class integer {
    public static int divide(int A, int B) {
        int sign = 1;
        long ans = 0;
        if (A < 0) {
            A = Math.abs(A);
            sign *= -1;
        }
        if (B < 0) {
            B = Math.abs(B);
            sign *= -1;
        }
        System.out.println(Integer.MAX_VALUE);
        for (int i = 31; i >= 0; i--) {
            System.out.println("OK: " + (B << i));
            if ((B << i) > A)
                continue;
            else {
                A -= (B << i);
                ans = ans | (1 << i);
            }
            System.out.println("A: " + A + " ans: " + ans);
        }
        return (int) (ans * sign);
    }

    public static void main(String[] args) {
        int ans = divide(0 , 1);
    }
}
