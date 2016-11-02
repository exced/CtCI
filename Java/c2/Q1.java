/*
* Write code to remove duplicates from an unsorted linked list. 
* FOLLOW UP
* How would you solve this problem if a temporary buffer is not allowed?
*/

public class Q1 {

    public static void remodeDups(ctcilib.LinkedListNode node) {
        while(node != null) {
            if (node.getNext() != null)
                if (node.getData() == node.getNext().getData()) {
                    node.setNext(node.getNext().getNext());
                }
            node = node.getNext();
        }
    }

    public static void main(String[] args) {

    }
}