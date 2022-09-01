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
    
    int goodCount = 0;
    
    public int goodNodes(TreeNode root) {
        int max = root.val-1;
        
        countGood(root, max);
        
        return goodCount;
    }
    
    public void countGood(TreeNode root, int max){
        if(max <= root.val){
            goodCount++;
            max = root.val;
        }
        
        if(root.left != null){
            countGood(root.left, max);
        }
        
        if(root.right != null){
            countGood(root.right, max);
        }
    }
}