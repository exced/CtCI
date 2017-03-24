package ctcilib;

public class BSTree {

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode root;

    public BSTree() {

    }

    public void add(int i) {
        add(root, i);
    }

    public void add(TreeNode node, int i) {
        if (node != null && i <= node.data) {
            if (node.left != null) {
                add(node.left, i);
            } else {
                node.left = new TreeNode(i);
            }
        } else {
            if (node.right != null) {
                add(node.right, i);
            } else {
                node.right = new TreeNode(i);
            } 
        }
    }

    /**
    * @param array must be increasingly sorted 
    */
    public TreeNode createMinimalBST(int[] arr, int left, int right) {
        if (left >= right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = root.createMinimalBST(arr, left, mid-1);
        root.right = root.createMinimalBST(arr, mid, right);    
        return root;
    }
}