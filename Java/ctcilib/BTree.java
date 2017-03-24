package ctcilib;

public class BTree {

    private static class TreeNode {
        private String name;
        private TreeNode left;
        private TreeNode right;
    }
    private TreeNode root;

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        visit(root);
        inOrder(root.right);
    }

    private void preOrder(TreeNode root) {
        if (root == null)
            return;
        visit(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    private void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        visit(root);
    }

    private void visit(TreeNode root) {
        System.out.println(root.name);
    }
}