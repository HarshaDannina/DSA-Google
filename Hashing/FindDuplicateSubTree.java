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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String, Integer> map = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();
        inorder(root, map, ans);
        return ans;
    }
    
    private String inorder(TreeNode node, HashMap<String, Integer> map, List<TreeNode> ans) {
        if(node==null)
            return "";
        String s = String.valueOf(node.val) + "L" + inorder(node.left, map, ans) + "R" + inorder(node.right, map, ans);
        
        if(map.get(s)!=null && map.get(s)==1){
            ans.add(node);
        } 
        map.put(s, map.getOrDefault(s, 0)+1);
        return s;
    }
}