package c2;
/*
* Write code to remove duplicates from an unsorted linked list. 
* FOLLOW UP
* How would you solve this problem if a temporary buffer is not allowed?
*/
import ctcilib.LinkedListNode;
import ctcilib.DLinkedListNode;


public class Q1 {

    /*
    * using singly linked list
    */
    public static void remodeDups(LinkedListNode<T> node) {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (node != null) {
            LinkedListNode<T> next = node.getNext();
            while(next != null) {
                T data = next.getData();
                if (countMap.containsKey(data))
                    if (next.getNext() == null)
                        node.setNext(new LinkedListNode<T>());
                    else   
                        node.setNext(next.getNext());
                else
                    countMap.put(data, new Integer(1));

                node = next.getNext();
                next = next.getNext();                    
            }
        }
    }

    /*
    * using double linked list
    */
    public static void removeDups2(DLinkedListNode<T> node) {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (node != null) {
            LinkedListNode<T> next = node.getNext();
            while(next != null) {
                T data = next.getData();
                if (countMap.containsKey(data))
                    if (next.getNext() == null)
                        node.setNext(new LinkedListNode<T>());
                    else   
                        node.setNext(next.getNext());
                else
                    countMap.put(data, new Integer(1));

                node = next.getNext();
                next = next.getNext();                    
            }
        }        
    }

    public static void main(String[] args) {
        /* creating the linkedlist */
        LinkedListNode<Integer> one = new LinkedListNode<Integer>(1);
        LinkedListNode<Integer> two = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> three = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> one2 = new LinkedListNode<Integer>(1);
        LinkedListNode<Integer> nul = new LinkedListNode<Integer>();
        one.setNext(one2);
        one2.setNext(two);
        System.out.println(one.toString());
    }
}