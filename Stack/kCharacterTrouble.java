public class Solution {
    public String solve(String A, int B) {
        Stack<Character> alphabets = new Stack<>();
        Stack<Integer> occurrences = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if(B == 1) return "";
        for(char ch : A.toCharArray()){
            if(alphabets.isEmpty()){
                alphabets.push(ch);
                occurrences.push(1);
            }
            else if(alphabets.peek() == ch){
                int lastOccurrence = occurrences.pop();
                alphabets.push(ch);
                occurrences.push(lastOccurrence + 1);
            }
            else{
                alphabets.push(ch);
                occurrences.push(1);
            }

            if(!occurrences.isEmpty() && occurrences.peek() == B){
                for(int i = 0; i < B; i++) alphabets.pop();
                occurrences.pop();
            }
        }
        while(!alphabets.isEmpty()) sb.append(alphabets.pop());
        return sb.reverse().toString();
    }
}
