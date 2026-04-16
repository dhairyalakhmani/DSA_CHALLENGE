"""
There are N poles, and the height of the poles is given by an integer array A.
You have to connect two poles such that all the poles between them have a height smaller than the minimum height of the two poles.
Find the total number of pairs of such poles.

NOTE:

The heights of the given poles are distinct
"""
public class Solution {
    public int solve(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i : A){
            while(!stack.isEmpty() && stack.peek() <= i){
                stack.pop();
                count++;
            }
            if(!stack.isEmpty()) count++;
            stack.push(i);
        }
        return count;
    }
}

