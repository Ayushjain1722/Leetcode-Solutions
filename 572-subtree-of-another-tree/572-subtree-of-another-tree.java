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
    boolean ans = false;
    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if((root==null && subRoot!=null) || 
           (root!=null && subRoot==null))    return false;
        if(root.val!=subRoot.val)   return false;
        boolean left = isSame(root.left, subRoot.left);
        boolean right = isSame(root.right, subRoot.right);
        return left && right;
    }
    public void Helper(TreeNode root, TreeNode subRoot){
        if(root==null)  return;
        if(root.val == subRoot.val && ans==false){
            ans = isSame(root, subRoot);
        }
        Helper(root.left, subRoot);
        Helper(root.right, subRoot);
        return;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Helper(root, subRoot);
        return ans;
    }
}