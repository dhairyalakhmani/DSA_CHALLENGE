/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int solve(TreeNode A) {
        if(A == null) return 0;
        long total = sum(A);
        if(total % 2 != 0) return 0;
        check(A, total / 2);
        return found ? 1 : 0;
        
    }
    private long sum(TreeNode node){
        if(node == null) return 0L;
        return node.val + sum(node.left) + sum(node.right);
    }
    private boolean found = false;
    private long check(TreeNode node, long target){
        if(node == null) return 0;
        if(found) return 0;
        long left = check(node.left, target);
        long right = check(node.right, target);

        long currSum = node.val + left + right;
        if(currSum == target) found = true;
        return currSum;
    }
}
