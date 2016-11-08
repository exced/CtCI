package c2;
/*
* Implement an algorithm to find the kth to last element of a singly linked list.
*/

import ctcilib.LinkedList;

public class Q2 {

    public static void main(String[] args) {
        /* creating the linkedlist */
        LinkedList<Integer> empty = new LinkedList<Integer>();
        LinkedList<Integer> list1 = new LinkedList<Integer>(new Integer[] {1,1,2,3,4,5});
        System.out.println("singly linkedList : " + list1.toString());
        System.out.println("kth to end singly linkedList : " + list1.kth2End(2).toString());
    }
}