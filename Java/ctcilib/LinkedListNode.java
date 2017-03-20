package ctcilib;

/*
* Singly Linked List
*/
public class LinkedListNode<T extends Comparable<T>> {

    private T data;
    private LinkedListNode<T> next;

    public LinkedListNode() {    
    }

    public LinkedListNode(T data) {
        this.data = data;
    }

    /*
    * build a singly linked list from "left ro right" according to the arguments order.
    */
    public LinkedListNode(T[] datas) {
        this.data = datas[0];
        LinkedListNode<T> currentNode = this;
        for (int i = 1; i < datas.length; i++) {
            currentNode.setNext(new LinkedListNode<T>(datas[i]));
            currentNode = currentNode.getNext();
        }
    }

    public LinkedListNode(LinkedListNode<T>[] nodes) {
        this.data = nodes[0].getData();
        LinkedListNode<T> currentNode = this;
        for (int i = 1; i < nodes.length; i++) {
            currentNode.setNext(nodes[i]);
            currentNode = currentNode.getNext();
        }
    }     

    public T getData() { return data; }
    public LinkedListNode<T> getNext() { return next; }
    public void setData(T data) { this.data = data; }
    public void setNext(LinkedListNode<T> next) { this.next = next; }

    /*
    * append node to the tail
    */
    public void append(LinkedListNode<T> node) {
        LinkedListNode<T> currentNode = this;
        /* move to the end */
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        /* append */
        while (node != null) {
            currentNode.setNext(node);
            currentNode = currentNode.getNext();
            node = node.getNext();
        }
    }

    /*
    * get length of list
    */
    public int length() {
        int length = 0;
        LinkedListNode<T> curr = this;
        while (curr != null) {
            length++;
            curr = curr.getNext();
        }
        return length;
    }

    /*
    * remove index
    */
    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.length()) {
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<T> curr = this;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.getNext();
        }
        curr.setNext(curr.getNext().getNext());
    }

    /*
    * using singly linked list
    */
    public void removeDups() {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (this != null) {
            LinkedListNode<T> next = this.getNext();
            countMap.put(this.data, new Integer(1));
            while(next != null) {
                T data = next.getData();
                if (countMap.containsKey(data))
                    if (next.getNext() == null)
                        this.setNext(new LinkedListNode<T>());
                    else   
                        this.setNext(next.getNext());
                else
                    countMap.put(data, new Integer(1));
                next = next.getNext();                    
            }
        }
    }  

    public LinkedListNode<T> slice(int k) {
        if (k <= 0)
            return null;
        LinkedListNode<T> node = this;
        /* move to kth */
        for (int i = 1; i < k; i++) {
            if (node == null)
                return null;                
            node = node.getNext();   
        }
        return node;
    }    

    /*
    * Write code to partition a linked list around a value x, such that all nodes less than x come 
    * before all nodes greater than or equal to x.
    */    
    public LinkedListNode<T> splitPart(T value) {
        LinkedListNode<T> le_begin = new LinkedListNode<T>(); // lower equal
        LinkedListNode<T> le_end = le_begin;
        LinkedListNode<T> g_begin = new LinkedListNode<T>(); // greater
        LinkedListNode<T> g_end = g_begin;
        LinkedListNode<T> currentNode = this;
        while (currentNode != null) {
            if (currentNode.getData().compareTo(value) <= 0) {
                le_end.setNext(currentNode);
                le_end = le_end.getNext();
            }                
            else {
                g_end.setNext(currentNode);
                g_end = g_end.getNext();
            }                
            currentNode = currentNode.getNext();                
        }
        le_begin.getNext().append(g_begin.getNext());         
        return le_begin.getNext();
    }

    public String toString() {
        java.lang.StringBuffer str = new java.lang.StringBuffer();
        LinkedListNode<T> node = this;
        while (node != null && node.getData() != null) {
            str.append("[" + node.getData().toString() + "] - ");
            node = node.getNext();
        }
        return str.toString();
    } 

}