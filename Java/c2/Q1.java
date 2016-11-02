package c2;
/*
* Write code to remove duplicates from an unsorted linked list. 
* FOLLOW UP
* How would you solve this problem if a temporary buffer is not allowed?
*/
import ctcilib.LinkedListNode;

public class Q1 {

    /*
    * using simply linked list
    */
    public static void remodeDups(LinkedListNode<T> node) {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (node != null) {
            LinkedListNode<T> next = node.getNext();
            while(next != null) {
                T data = next.getData();
                if (countMap.containsKey(data))
                    node.setData();
                else
                    countMap.put(data, new Integer(1));
                /* iterate */
                node = next.getNext();
                next = next.getNext();                    
            }
        }
    }

    /*
    * using double linked list
    */
    public static void removeDups2(LinkedListNode<T> node) {

    }

    public static void main(String[] args) {
        /* creating the linkedlist */
        LinkedListNode<int> one = new LinkedListNode<int>(1);
        LinkedListNode<int> two = new LinkedListNode<int>(2);
        LinkedListNode<int> three = new LinkedListNode<int>(3);
        LinkedListNode<int> one2 = new LinkedListNode<int>(1);
        LinkedListNode<int> nul = new LinkedListNode<int>();
        one.setNext(two);
        two.setNext();
    }
}