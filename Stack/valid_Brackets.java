//Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
//Refer to the examples for more clarity.

public class Solution {
  public int solve(String A){
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < A.length(); i++){
      char ch = A.charAt(i);
      if(ch == '(' || ch == '{' || ch == '['){
        stack.push(ch);
      }
      else{
        if(stack.isEmpty()) return 0;
        if(( ch == ')' && stack.pop() != '(' ) || ( ch == '}' && stack.pop() != '{' ) || ( ch == ']' && stack.pop() != '[' ) ) return 0;
        else stack.pop();
      }
    }
    return stack.isEmpty() ? 1 : 0;
  }
}
