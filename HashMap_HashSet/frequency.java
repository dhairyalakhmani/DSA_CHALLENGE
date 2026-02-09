package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;

public class frequency {
    public static void freq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
    }
}
