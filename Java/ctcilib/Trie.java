package ctcilib;

import java.util.HashMap;

public class Trie {

    public static class Node {
        private HashMap<Character, Node> children = new HashMap<Character, Node>();
        private boolean isComplete = false;
    }
}