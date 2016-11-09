package c2;
/*
* Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
*/
import ctcilib.LinkedListNode;

public class Q3 {  

    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {1,1,2,3,4,5});
        System.out.println("singly linkedList1 : " + list1.toString());
        LinkedListNode<Integer> node3 = list1.kth2End(3);
        if (node3 != null && node3.removeNode())
            System.out.println("singly linkedList1 - node 3  : " + list1.toString());
        else
            System.out.println("singly linkedList1 : null ");        
    }
}