package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class closestDiffBetweenDuplicates {
    public static int difference(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                int difference = i - map.get(arr[i]);
                if(difference < minDiff)
                    minDiff = difference;
            }
            map.put(arr[i] , i);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {3 , 5 , 2 , 3, 6 , 0 , 5 , 2 , 3};
        System.out.println(difference(arr));
    }
}
