package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashSet;

// In this question we only have to keep and count the numbers once and ignore the duplicates and return the count of these unique numbers.
public class thedistinctnumber {
    public static int distincts(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
            set.add(i);
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 1 , 5};
        System.out.println(distincts(arr));
    }
}
