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
    private static List<Integer>helper(TreeNode root,List<Integer>arr){
        if (root == null)
            return arr;
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
        return arr;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        return helper(root,arr);
    }
}
