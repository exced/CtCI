package ctcilib;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacents = new LinkedList<Node>();
        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {
        return nodeLookup.get(id);
    }

    public void addEdge(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode =  getNode(destination);
        sourceNode.adjacents.add(destinationNode);

    }

    public boolean hasPathDFS(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(sourceNode, destinationNode, visited);
    }

    public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
        if (visited.contains(source.id)) {
            return false;
        }
        if (destination == source) {
            return true;
        }
        for (Node adj : source.adjacents) {
            if (hasPathDFS(adj, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        return hasPathBFS(sourceNode, destinationNode);
    }

    public boolean hasPathBFS(Node source, Node destination) {
        LinkedList<Node> visiting = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
        visiting.add(source);
        while(!visiting.isEmpty()) {
            Node node = visiting.remove();
            if (node == destination) {
                return true;
            }
            if (visited.contains(node.id)) {
                continue;
            }
            for (Node adj : node.adjacents) {
                visiting.add(adj);
            }
        }
        return false;
    }

}