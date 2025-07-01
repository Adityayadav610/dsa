class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        inorder(root, lst);
        return lst;
    }
    
    private void inorder(TreeNode node, List<Integer> lst) {
        if (node == null) {
            return;
        }
        inorder(node.left, lst);
        lst.add(node.val);
        inorder(node.right, lst);
    }
}