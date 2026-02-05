package DSA_CHALLENGE.BitManipulation;

public class subarrayOR {
    public static final int MOD = 1_000_000_007;
    public static int subarray(int[] A){
        int n = A.length;
        int total = n * (n + 1) / 2;
        int finalAns = 0;
        for(int i = 0 ; i < 32 ; i ++){
            long missing = 0L;
            int length = 0;
            for (int pos : A) {
                if ((pos & (1 << i)) == 0) length++;
                else {
                    missing += (long) length * (length + 1) / 2;
                    length = 0;
                }
            }
            missing += (long) length * (length + 1) / 2;
            int contributions = (total - (int)missing) % MOD;
            finalAns += ((1 << i) * contributions) % MOD;

        }
        return finalAns;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        System.out.println(subarray(arr));
    }
}
