package DSA_CHALLENGE.HashMap_HashSet;

import java.util.HashSet;

public class intersection {
    public static void intersection(int[] A , int[] B){
        HashSet<Integer> set = new HashSet<>();
        for(int i : A)
            set.add(i);
        for(int i : B){
            if(set.contains(i))
                continue;
            else
                set.remove(i);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] A = {3, 8 , 1 , 0, 2, 9 , 11 , 7};
        int[] B = {9 , 17 , 13 , 3 , 6 , 5};
        intersection(A , B);
    }
}
