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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null){
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        q.add(null); //Represents a change in level!
        
        List<Integer> level = new ArrayList<>();
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            if(curr == null){                
                if(q.isEmpty()){
                    res.add(level);
                    break;
                }
                else{
                    res.add(level);
                    level = new ArrayList<>();
                    q.add(null);
                    continue;
                }
                
            }
            
            level.add(curr.val);
            
            if(curr.left != null){
                q.add(curr.left);                
            }
            
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        
        return res;
    }
}