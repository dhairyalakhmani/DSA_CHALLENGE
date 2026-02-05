package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class frequency {
    public static void freq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
    }
}
