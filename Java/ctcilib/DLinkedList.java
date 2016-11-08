package ctcilib;
/*
* Singly LinkedList class, uses LinkedListNode 
*/

import ctcilib.DLinkedListNode;

public class DLinkedList<T> {

    private DLinkedListNode<T> first;

    public DLinkedList() {
        this.first = new DLinkedListNode<T>();
    }

    /*
    * build a doubly linked list.
    */
    public DLinkedList(T[] datas) {
        this.first = new DLinkedListNode<T>(datas[0]);
        DLinkedListNode<T> currentNode = this.first;
        for (int i = 1; i < datas.length; i++) {
            currentNode.setNext(new DLinkedListNode<T>(datas[i]));
            currentNode = currentNode.getNext();
        }
    }

    public DLinkedList(DLinkedListNode<T>[] nodes) {
        this.first = nodes[0];
        DLinkedListNode<T> currentNode = this.first;
        for (int i = 1; i < nodes.length; i++) {
            currentNode.setNext(nodes[i]);
            currentNode = currentNode.getNext();
        }
    }    

    public DLinkedListNode<T> getFirst() { return this.first; }
    public void setFirst(DLinkedListNode<T> first) { this.first = first; }

    public void removeDups() {
        this.first.removeDups();
    }    

    public DLinkedList<T> kth2End(int k) {
        if (k <= 0)
            return null;
        DLinkedListNode<T> node = this.getFirst();
        /* move to kth */
        for (int i = 1; i <= k; i++) {
            if (node == null)
                return null;
            node = node.getNext();    
        }
        return new DLinkedList<T>(node);
    }


    public String toString() {
        return this.first.toString();
    }

}