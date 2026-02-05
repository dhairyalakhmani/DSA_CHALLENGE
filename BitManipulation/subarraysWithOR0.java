package DSA_CHALLENGE.BitManipulation;

public class subarraysWithOR0 {
    public static int countSubs (int[] arr){
        int n = arr.length;
        int count = 0;
        int ans = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] == 0){
                count++;
            }
            else{
                ans += count * (count + 1) / 2;
                count = 0;
            }
        }
        ans += count * (count + 1) / 2;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 0 , 0 , 1 , 0 , 0};
        System.out.println(countSubs(arr));
    }
}
//  0 0 0 1 0 0 0 1 1 0 0
// a b c d e
// ab de bd ad be