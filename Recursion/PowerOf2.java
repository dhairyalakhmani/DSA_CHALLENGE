package DSA_CHALLENGE.Recursion;

public class PowerOf2 {
    static int a = 1;
    public static boolean isPowerOfTwo(int n) {
        if(n % 2 != 0)
            return false;

        if(a == 0)
            a = 1;

        if(a <= n) {
            if(a == n){
                a = 0;
                return true;
            }
            else {
                if(a < 1073741824)
                    a *= 2;
                else {
                    a = 0;
                    return false;
                }
                return isPowerOfTwo(n);
            }
        }
        else {
            a = 0;
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2147483646));
    }
}
