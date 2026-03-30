/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return find(root).diameter - 1;
    }

    public TreeData find(TreeNode root){
        if(root == null) return new TreeData(0 , 0);
        TreeData left = find(root.left);
        TreeData right = find(root.right);
        int maxDiameter = Math.max(left.diameter , Math.max(right.diameter , left.height + right.height + 1));
        int maxHeight = 1 + Math.max(left.height , right.height);
        return new TreeData(maxHeight , maxDiameter);
    }

    static class TreeData{
        int height;
        int diameter;

        TreeData(int height , int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
}
