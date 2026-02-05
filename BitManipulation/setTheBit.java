package DSA_CHALLENGE.BitManipulation;

public class setTheBit {
    public static int set(int N , int i){
        return N | (1 << i);
    }

    public static void main(String[] args) {
        int N = 10;
        int i = 2;
        System.out.print(set(N , i));
    }
}
