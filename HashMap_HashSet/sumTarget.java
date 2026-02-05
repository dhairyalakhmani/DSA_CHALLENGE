package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class sumTarget {
    public static boolean sumtarget(int[] arr, int K) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer , Character> map = new HashMap<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int j : arr) {
            if (set.contains(K - j))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3 , 1 , 5 , 2, 7 , 9, 4};
        System.out.println(sumtarget(arr , 12));
    }
}
