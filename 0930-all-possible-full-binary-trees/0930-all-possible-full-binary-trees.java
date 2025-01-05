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
    public List<TreeNode> allPossibleFBT(int n) {
         List<TreeNode> result = new ArrayList<>();  
        if (n % 2 == 0) {  
            return result;   
        }  
        return generateFBT(n);  
    }
     private List<TreeNode> generateFBT(int n) {  
        List<TreeNode> result = new ArrayList<>();  
        if (n == 1) {  
            result.add(new TreeNode(0));   
            return result;  
        }  

        for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {  
            int rightNodes = n - 1 - leftNodes;
            List<TreeNode> leftTrees = generateFBT(leftNodes);  
            List<TreeNode> rightTrees = generateFBT(rightNodes);  

            for (TreeNode left : leftTrees) {  
                for (TreeNode right : rightTrees) {  
                    TreeNode root = new TreeNode(0);  
                    root.left = left;  
                    root.right = right;
                    result.add(root);   
                }  
            }  
        }  
        return result;  
}   }