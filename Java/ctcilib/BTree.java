package ctcilib;

import java.util.LinkedList;
import java.util.HashSet;

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

    private void visit(TreeNode root) {
        System.out.println(root.name);
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

    /**
     * list of depths using BFS
     */
    public LinkedList<TreeNode>[] ListOfDepths(TreeNode root, int depth) {
        LinkedList<TreeNode>[] result = new LinkedList<TreeNode>[depth];
        LinkedList<TreeNode> visiting = new LinkedList<TreeNode>();
        HashSet<TreeNode> visited = new HashSet<TreeNode>();
        visiting.add(root);
        int index = 0;
        while(!visiting.isEmpty()) {
            TreeNode head = visiting.remove();
            if (visited.contains(adj)) {
                continue;
            }
            visited.add(head);
            result[index] = new LinkedList<TreeNode>();
            for (TreeNode adj : head.adjacents) {
                visiting.add(adj);
                result[index].add(adj);
            }
            index++;
        }
        return result;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left), height(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void inOrderTraversal(TreeNode root, LinkedList<TreeNode> inOrder) {
        if (root == null) return;
        inOrderTraversal(root.left, inOrder);
        inOrder.add(root);
        inOrderTraversal(root.right, inOrder);
    }

    public TreeNode commonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        LinkedList<TreeNode> inOrder = new LinkedList<TreeNode>();
        if (node1.left == node2 || node1.right = node2) {
            return node1;
        }
        if (node2.left == node1 || node2.right = node1) {
            return node2;
        }        
        inOrderTraversal(root, inOrder);
        boolean firstFound = false;
        TreeNode tmp;
        for (int i = 0; i < inOrder.size(); i++) {
            tmp = inOrder.get(i);
            if (!firstFound && tmp == node1) {
                node1 = tmp;
                firstFound = true;
            }
            if (!firstFound && tmp == node2) {
                node2 = tmp;
                firstFound = true;
            }
            if (firstFound && tmp == node1) {
                node1 = inOrder.get(i-1);
            }
            if (firstFound && tmp == node2) {
                node2 = inOrder.get(i-1);
            }                      
        }
        return commonAncestor(root, node1, node2);
    }
}