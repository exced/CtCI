package ctcilib;
/*
* Singly LinkedList class, uses LinkedListNode 
*/

import ctcilib.LinkedListNode;

public class LinkedList<T> {

    private LinkedListNode<T> first;

    public LinkedList() {
        this.first = new LinkedListNode<T>();
    }

    public LinkedList(LinkedListNode<T> first) {
        this.first = first;
    }

    /*
    * build a singly linked list from "left ro right" according to the arguments order.
    */
    public LinkedList(T[] datas) {
        this.first = new LinkedListNode<T>(datas[0]);
        LinkedListNode<T> currentNode = this.first;
        for (int i = 1; i < datas.length; i++) {
            currentNode.setNext(new LinkedListNode<T>(datas[i]));
            currentNode = currentNode.getNext();
        }
    }

    public LinkedList(LinkedListNode<T>[] nodes) {
        this.first = nodes[0];
        LinkedListNode<T> currentNode = this.first;
        for (int i = 1; i < nodes.length; i++) {
            currentNode.setNext(nodes[i]);
            currentNode = currentNode.getNext();
        }
    }    

    public LinkedListNode<T> getFirst() { return this.first; }
    public void setFirst(LinkedListNode<T> first) { this.first = first; }

    public void removeDups() {
        this.first.removeDups();
    }

    public String toString() {
        return this.first.toString();
    }

    public LinkedList<T> kth2End(int k) {
        if (k <= 0)
            return null;
        LinkedListNode<T> node = this.getFirst();
        /* move to kth */
        for (int i = 1; i <= k; i++) {
            if (node == null)
                return null;
            node = node.getNext();    
        }
        return new LinkedList<T>(node);
    }

}