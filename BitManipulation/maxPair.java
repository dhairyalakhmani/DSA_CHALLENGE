package DSA_CHALLENGE.BitManipulation;

public class maxPair {
    public static int maxpair(int[] arr){
        int ans = 0;
        int n = arr.length;
        for(int i = 31 ; i >= 0 ; i--){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if((arr[j] & (1 << i)) != 0)
                    count++;
            }

            if(count >= 2) {
                ans = ans | (1 << i);
                for (int j = 0; j < n; j++) {
                    if ((arr[j] & (1 << i)) == 0) {
                        arr[j] = 0;
                    }
                }
            }
            else{
                ans = ans & ~(1 << i);
            }
        }
        return ans;
    }
}
