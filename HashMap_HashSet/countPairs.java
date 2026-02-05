package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class countPairs {
    public static void countPairs(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
               map.put(arr[i] , map.get(arr[i]));

            }

            else
                map.put(arr[i] , 1);
        }
    }
}
