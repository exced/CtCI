package c2;
/*
 * Palindrome : Implement a function to check if a linked list is a palindrome
*/

import ctcilib.LinkedListNode;

public class Q6 {

    public static boolean isPalindrome(LinkedListNode<Character> list) {
        LinkedListNode<Character> head = list;
        LinkedListNode<Character> tail = list;
        int length = 0;
        int middleIndex = 0;
        if (list == null) {
            return false;
        }
        /* set tail */
        while (tail != null) {
            length++;
            tail = tail.getNext();
        }
        if (length % 2 == 0) { // if even
            return false;
        }
        middleIndex = length / 2;
        tail = head;
        for (int i = 0; i <= middleIndex; i++) { // go to middle
            tail = tail.getNext();
        }
        for (int i = 0; i < middleIndex; i++) {
            if (head.getData() != tail.getData()) {
                return false;
            }
            head = head.getNext();
            tail = tail.getNext();
        }
        return true;
    }

    public static void main(String []args){
        LinkedListNode<Character> list1 = new LinkedListNode<Character>(new Character[] {'k', 'a', 'k'});
        System.out.print("list1 : " + list1.toString() + " isPalindrome ? " + isPalindrome(list1));
    }
}
