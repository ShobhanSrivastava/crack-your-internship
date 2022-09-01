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
    
    public int goodNodes(TreeNode root) {
        int max = root.val-1;
        
        int goodCount = countGood(root, max);
        
        return goodCount;
    }
    
    public int countGood(TreeNode root, int max){
        boolean checkGood = (root.val >= max) ? true : false;
        
        if(checkGood){
            max = root.val;
        }
        
        int leftCount = 0, rightCount = 0;
        
        if(root.left != null){
            leftCount = countGood(root.left, max);
        }
        
        if(root.right != null){
            rightCount = countGood(root.right, max);
        }
        
        int currVal = (checkGood) ? 1 : 0;
        
        return leftCount + rightCount + currVal;
    }
}