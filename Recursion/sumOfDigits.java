package DSA_CHALLENGE.Recursion;

public class sumOfDigits {
    private static int sum( int n) {
        if(n <= 0) return n % 10;
        return sum(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sum(25215));
    }
}
