package c2;
/*
* Implement an algorithm to find the kth to last element of a singly linked list.
*/

import ctcilib.LinkedListNode;

public class Q2 {

    public static void main(String[] args) {
        /* creating the linkedlist */
        LinkedListNode<Integer> empty = new LinkedListNode<Integer>();
        System.out.println("singly linkedList empty : " + empty.toString());
        if (empty.kth2End(2) != null)
            System.out.println("kth to end singly linkedList empty : " + empty.kth2End(2).toString());     
        else 
            System.out.println("kth to end singly linkedList empty : null ");
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {1,1,2,3,4,5});
        System.out.println("singly linkedList1 : " + list1.toString());
        if (list1.kth2End(4) != null)
            System.out.println("kth to end singly linkedList1 : " + list1.kth2End(4).toString());
        else
            System.out.println("kth to end singly linkedList1 : null ");            
    }
}