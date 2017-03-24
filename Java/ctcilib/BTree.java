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

    /**
     * list of depths using BFS
     */
    public LinkedList<Node>[] ListOfDepths(Node root, int depth) {
        LinkedList<Node>[] result = new LinkedList<Node>[depth];
        LinkedList<Node> visiting = new LinkedList<Node>();
        HashSet<Node> visited = new HashSet<Node>();
        visiting.add(root);
        int index = 0;
        while(!visiting.isEmpty()) {
            Node head = visiting.remove();
            if (visited.contains(adj)) {
                continue;
            }
            visited.add(head);
            result[index] = new LinkedList<Node>();
            for (Node adj : head.adjacents) {
                visiting.add(adj);
                result[index].add(adj);
            }
            index++;
        }
        return result;
    }

    private void visit(TreeNode root) {
        System.out.println(root.name);
    }
}