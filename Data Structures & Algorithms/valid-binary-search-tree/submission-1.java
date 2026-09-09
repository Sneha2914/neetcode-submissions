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
    public boolean isValidBST(TreeNode root) {
        return validateBST(root,Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    public boolean validateBST(TreeNode root, Integer max,Integer min){
        if(root==null)
            return true;
        if(root.val>=max || root.val<=min)
            return false;
        return validateBST(root.left,root.val,min) && validateBST(root.right,max,root.val);
    }
}
