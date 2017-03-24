package ctcilib;

public class BSTree {

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
    }

    private TreeNode root;

    public BSTree() {

    }

    public void add(int i) {
        add(this.root, i);
    }

    private void add(TreeNode root, int i) {
        
    }
}