package DSA_CHALLENGE.HashMap_HashSet;
import java.util.HashMap;

public class longestUniqueSubstring {
    public static int longest(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        int max = 1;
        int start = 0 ;
        for(int end = 0 ; end < s.length() ; end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(start , map.get(ch) + 1);
            }
            map.put(ch , end);
            max = Math.max(max , end - start + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
    }
}
