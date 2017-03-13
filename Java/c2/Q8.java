package c2;

/*
 * Loop Detection : Given a circular list, implement an algorithm that returns the node at the beginning of the loop.
*/

import ctcilib.LinkedListNode;

public class Q8 {

    public static LinkedListNode<Character> getBeginningCircular(LinkedListNode<Character> list) {
        LinkedListNode<Character> slowRunner = list;
        LinkedListNode<Character> fastRunner = list;  
        while (fastRunner != null && fastRunner.getNext() != null) {
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext().getNext();
            if (fastRunner.equals(slowRunner)) {
                break;
            }
        }
        if (fastRunner == null || fastRunner == null) {
            return null;
        }
        slowRunner = list;
        while (!slowRunner.equals(fastRunner)) {
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext();
        }
        return slowRunner;
    }

    public static void main(String []args) {
        LinkedListNode<Character> list1 = new LinkedListNode<Character>(new Character[] {'A', 'B', 'C', 'D', 'E'});
        LinkedListNode<Character> c = list1.slice(3);
        LinkedListNode<Character> e = list1.slice(5);
        e.setNext(c);
        System.out.println("list1: loops at: " + getBeginningCircular(list1));
    }
}