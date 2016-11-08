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

}