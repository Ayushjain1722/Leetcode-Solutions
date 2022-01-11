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
    public int ans = 0;
    public int binaryToDecimal(String binary){
        int pow = 0;
        int decimal = 0;
        for(int i=binary.length()-1;i>=0;i--,pow++){
            if(binary.charAt(i)=='0')   continue;
            decimal += (int)Math.pow(2, pow);
        }
        return decimal;
    }
    public void Helper(TreeNode root, String binary){
        if(root==null)  return;
        if(root.left==null && root.right==null){
            ans += binaryToDecimal(binary+root.val);
            return;
        }
        Helper(root.left, binary+root.val);
        Helper(root.right, binary+root.val);
        return;
    }
    public int sumRootToLeaf(TreeNode root) {
        Helper(root, "");
        return ans;
    }
}