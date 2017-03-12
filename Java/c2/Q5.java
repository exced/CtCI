package c2;
/*
* You have two numbers represented by a linked list, where each node contains a singledigit.
* The digits are stored in reverse order, such that the 1's digit is at the head of the list. 
* Write a function that adds the two numbers and returns the sum as a linked list.
FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
*/

import ctcilib.LinkedListNode;

public class Q5 {

    /* 
     * easy way : list1(i) + list2(i) + carry
     */
    public static LinkedListNode<Integer> sumListsReverse(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        int carry = 0;
        int sumValue = 0;
        LinkedListNode<Integer> currList1 = list1;
        LinkedListNode<Integer> currList2 = list2;
        LinkedListNode<Integer> sum = new LinkedListNode<>(0);
        LinkedListNode<Integer> headSum = sum;
        while (currList1 != null || currList2 != null) {
            sumValue = 0;
            if (currList1 != null) {
                sumValue += currList1.getData();
            }
            if (currList2 != null) {
                sumValue += currList2.getData();
            }
            sumValue += carry;
            if (sumValue >= 10) {
                sumValue -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            sum.setNext(new LinkedListNode<Integer>(sumValue));
            sum = sum.getNext();
            currList1 = currList1.getNext();
            currList2 = currList2.getNext();
        }
        return headSum.getNext();
    }

    public static LinkedListNode<Integer> sumListsForward(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        java.util.Stack<Integer> carries = new java.util.Stack<Integer>();
        int sumValue = 0;
        LinkedListNode<Integer> currList1 = list1;
        LinkedListNode<Integer> currList2 = list2;
        LinkedListNode<Integer> sum = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> headSum = sum;
        while (currList1 != null || currList2 != null) {
            sumValue = 0;
            if (currList1 != null) {
                sumValue += currList1.getData();
            }
            if (currList2 != null) {
                sumValue += currList2.getData();
            }
            if (sumValue >= 10) {
                carries.push(new Integer(1));
                sumValue -= 10;
            }
            sum.setNext(new LinkedListNode<Integer>(sumValue));
            sum = sum.getNext();
            currList1 = currList1.getNext();
            currList2 = currList2.getNext();
        }
        sum = headSum.getNext();
        while (!carries.empty()) {
            sum.setData(sum.getData() + carries.pop());
            sum = sum.getNext();
        }
        return headSum.getNext();
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = new LinkedListNode<Integer>(new Integer[] {7,1,6});
        LinkedListNode<Integer> list2 = new LinkedListNode<Integer>(new Integer[] {5,9,2});
        LinkedListNode<Integer> list3 = new LinkedListNode<Integer>(new Integer[] {6,1,7});
        LinkedListNode<Integer> list4 = new LinkedListNode<Integer>(new Integer[] {2,9,5});        
        System.out.println("list1 : " + list1.toString());
        System.out.println("list2 : " + list2.toString());
        System.out.println("list3 : " + list2.toString());
        System.out.println("list4 : " + list2.toString());
        System.out.println("reverse sum list1 + list2 : " + sumListsReverse(list1, list2).toString());
        System.out.println("forward order sum list3 + list4 : " + sumListsForward(list3, list4).toString());
    }
}