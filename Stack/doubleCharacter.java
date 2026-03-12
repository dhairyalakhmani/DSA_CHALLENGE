/* You have a string, denoted as A.
To transform the string, you should perform the following operation repeatedly:
Identify the first occurrence of consecutive identical pairs of characters within the string.
Remove this pair of identical characters from the string.
Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
The final result will be the transformed string. */

public class Solution {
    public String solve(String A) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < A.length() ; i++){
            char ch = A.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else stack.push(ch);
        }
        if(stack.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
