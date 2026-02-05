package DSA_CHALLENGE.BitManipulation;

public class setUnsetBit {
    public static boolean setUnset(int n, int b){
        if((n & (1 << b)) != 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 25; int b = 3;
        System.out.println(setUnset(n , b));
    }
}
