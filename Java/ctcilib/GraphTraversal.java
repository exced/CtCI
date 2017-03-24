import java.util.HashSet;
import java.util.LinkedList;

public class GraphTraversal {

    public boolean hasPathDFS(Node src, Node dest) {
        return hasPathDFS(src, dest, new HashSet<Node>());
    }

    public boolean hasPathDFS(Node src, Node dest, HashSet<Node> visited) {
        if (src == dest) {
            return true;
        }
        if (visited.contains(src)) {
            return false;
        }
        visited.add(src);
        for (Node neighbor : dest.neighbors) {
            if (hasPathDFS(neighbor, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(Node src, Node dest) {
        LinkedList<Node> visiting = new LinkedList<Node>();
        HashSet<Node> visited = new HashSet<Node>();
        visiting.add(src);
        while(!visiting.isEmpty()) {
            Node head = visiting.remove();
            if (head == dest) {
                return true;
            }            
            if (visited.contains(head)) {
                continue;
            }
            for (Node neighbor : head.neighbors) {
                visiting.add(neighbor);
            }
        }
        return false;
    }
}