package c2;
/*
* Write code to remove duplicates from an unsorted linked list. 
* FOLLOW UP
* How would you solve this problem if a temporary buffer is not allowed?
*/
import ctcilib.LinkedListNode;
import ctcilib.DLinkedListNode;


public class Q1 {

    public static void main(String[] args) {
        /* creating the linkedlist */
        LinkedListNode<Integer> empty = new LinkedListNode<Integer>();
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {1,1,2});
        System.out.println("singly linkedList before : " + list1.toString());
        list1.removeDups();
        System.out.println("singly linkedList after : " + list1.toString());
        /* creating the DLinkedlist */
        DLinkedListNode<Integer> dlist1 = new DLinkedListNode<Integer>(new Integer[] {1,1,2});
        System.out.println("doubly linkedList before : " + dlist1.toString());
        dlist1.removeDups();
        System.out.println("doubly linkedList after : " + dlist1.toString());      
    }
}