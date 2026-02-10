package DSA_CHALLENGE.BinarySearch;

public class squareRoot {
    public static int sqrt(int N){
        int i = 1 , j = N;
        int ans = 0;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(mid * mid <= N){
                ans = mid;
                i = mid + 1;
            }
            else j = mid - 1;
        }
        return ans;
    }
}
