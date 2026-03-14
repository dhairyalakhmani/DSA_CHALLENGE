//  In this question '#' represents backspace, compare 2 strings being equals. Return true or false...
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#' && !s1.isEmpty()) s1.pop();
            else if(s1.isEmpty() && ch == '#') continue;
            else{
                s1.push(ch);
            }   
        }
        for(int i = 0 ; i < t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#' && !s2.isEmpty()) s2.pop();
            else if(s2.isEmpty() && ch == '#') continue;
            else{
                s2.push(ch);
            }   
        }

        if(s1.isEmpty() && s2.isEmpty()) return true;

        while(!s1.isEmpty() && !s2.isEmpty()){
            char ch1 = s1.pop();
            char ch2 = s2.pop();
            if(ch1 != ch2) return false;
        }
        if(!s1.isEmpty() || !s2.isEmpty()) return false;

        return true;
    }
}
