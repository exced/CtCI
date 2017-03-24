package ctcilib;

public class ListCycle {
    public static class LinkedList<T> {
        private static class Node<T> {
            private T data;
            private Node next;
            public Node(T data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head;
        public LinkedList(T data) {
            this.head = new Node<T>(data);
        }
        public boolean detectCycle() {
            if (head == null) return false;
            Node<T> fast = head.next;
            Node<T> slow = head;
            while(fast != null && fast.next != null && slow.next != null) {
                if (fast == slow) return true;
                fast = fast.next.next;
                slow = slow.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        
    }
}