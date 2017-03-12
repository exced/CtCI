package c2;
 /*
  * Intersect : Given two (singly) linked lists, determine if the two intersects.
  * Return the intersecting node. Note that the intersection is defined base on reference, not value.
  * That is, if the Kth node of the first linked list is the exact same node (by reference) as the jth
  * node of the second linked list, then they are intersecting.
  */
import ctcilib.LinkedListNode;

public class Q7 {

    /*
    * @pre list1 and list2 have different lengths
    */
    public static LinkedListNode<Integer> intersect(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        LinkedListNode<Integer> currList1 = list1;
        LinkedListNode<Integer> currList2 = list2;
        LinkedListNode<Integer> curr = null;
        int length1 = 0;
        int length2 = 0;
        /* compare tails and get "lengths" (length-1 but we do not use it)*/
        while (currList1.getNext() != null) {
            currList1 = currList1.getNext();
            length1++;
        }
        while (currList2.getNext() != null) {
            currList2 = currList2.getNext();
            length2++;
        }   
        if (!currList1.equals(currList2)) { // no intersection
            return null;
        }
        currList1 = list1;
        currList2 = list2;
        if (length1 < length2) {
            curr = currList2;
        } else {
            curr = currList1;
        }
        for (int i = 0; i < Math.abs(length1-length2); i++) {
            curr = curr.getNext();
        }
        if (length1 < length2) {
            currList2 = curr;
        } else {
            currList1 = curr;
        }
        while (!currList1.equals(currList2)) {
            currList1 = currList1.getNext();
            currList2 = currList2.getNext();
        }
        return currList1;
    }

    public static void main(String []args){
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {3, 1, 5, 9});
        LinkedListNode<Integer> list2 = new LinkedListNode<Integer>(new Integer[] {4, 6});
        LinkedListNode<Integer> list3 = new LinkedListNode<Integer>(new Integer[] {7, 2, 1});
        list1.append(list3);
        list2.append(list3); 
        System.out.println("list1: " + list1.toString() + " intercepts " + list2.toString() + " at " + intersect(list1, list2));
    }
}