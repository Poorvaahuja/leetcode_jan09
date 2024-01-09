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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList(); // created arraylist for both the trees, so that leaf nodes can be stored in them
        List<Integer> leaves2 = new ArrayList();
        dfs(root1,leaves1); // dfs is used so that we can traverse till the end in the tree
        dfs(root2, leaves2);
        return leaves1.equals(leaves2); // if both the arraylist are equal, it returns true
    }
    public void dfs(TreeNode node, List<Integer> leafValues){
        if(node != null){
            if(node.left == null && node.right == null){ // check for the leaf node, then add their value to the list
                leafValues.add(node.val);
            }
            dfs(node.left, leafValues); // recursivley calling dfs for the left subtree if leaf node was not found
            dfs(node.right, leafValues); // similary, right subtree
        }
    }
}
