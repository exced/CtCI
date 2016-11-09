package c2;
/*
* Write code to partition a linked list around a value x, such that all nodes less than x come 
* before alt nodes greater than or equal to x.
*/
import ctcilib.LinkedListNode;

public class Q4 {

    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {1,4,2,3,4,5});
        System.out.println("singly linkedList1 : " + list1.toString());
        list1.append(new LinkedListNode<Integer>(new Integer[] {2,6,1}));
        System.out.println("singly linkedList1 append test : " + list1.toString());
        LinkedListNode<Integer> list = list1.splitPart(new Integer(3));
        if (list != null)
            System.out.println("singly linkedList1 splitParted : " + list.toString());
        else
            System.out.println("singly linkedList1 : null ");         
    }
}