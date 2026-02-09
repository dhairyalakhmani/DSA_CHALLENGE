package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class targetSumCount {
    public static int counter(int[] arr , int K){
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(K - arr[i])){
                ans += map.get(K - arr[i]);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5 , 5, 5 , 5 , 5};
        System.out.println(counter(arr , 10));
    }
}
