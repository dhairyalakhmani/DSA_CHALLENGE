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
    private Map<Integer, List<TreeData>> map;
    private int globalMin;
    private int globalMax;
    public List<List<Integer>> verticalTraversal(TreeNode root){
        this.map = new HashMap<>();
        this.globalMin = Integer.MAX_VALUE;
        this.globalMax = Integer.MIN_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        solve(root, 0, 0);
        for(int i = globalMin; i <= globalMax; i++){
            List<TreeData> list = map.get(i);
            Collections.sort(list, (a , b) -> {
                if(a.y_dist == b.y_dist) return a.value - b.value;
                return a.y_dist - b.y_dist;
            });
            List<Integer> listOfValues = new ArrayList<>();
            for(TreeData data : list)
                listOfValues.add(data.value);
            ans.add(listOfValues);
        }
        return ans;
    }
    private void solve(TreeNode node, int x, int y){
        if(node == null) return;
        if(!map.containsKey(x)){
            map.put(x, new ArrayList<>());
        }
        map.get(x).add(new TreeData(y, node.val));
        if(this.globalMax < x) this.globalMax = x;
        if(this.globalMin > x) this.globalMin = x;
        solve(node.left, x - 1, y + 1);
        solve(node.right, x + 1, y + 1);
    }
    static class TreeData{
        int y_dist;
        int value;
        public TreeData(int y_dist, int value){
            this.y_dist = y_dist;
            this.value = value;
        }
    }
}
