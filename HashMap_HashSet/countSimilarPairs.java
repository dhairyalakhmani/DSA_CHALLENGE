package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class countSimilarPairs {
    public static int counter(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                ans += map.get(arr[i]);
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else
                map.put(arr[i] , 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3 , 5 , 2 , 3 , 6 , 5 ,5 , 2 , 3};
        System.out.println(counter(arr));
    }
}
