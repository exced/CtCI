package ctcilib;

/*
* Singly Linked List
*/
public class LinkedListNode<T> {

    private T data;
    private LinkedListNode<T> next;

    public LinkedListNode() {    
    }

    public LinkedListNode(T data) {
        this.data = data;
    }

    public T getData() { return data; }
    public LinkedListNode<T> getNext() { return next; }
    public void setData(T data) { this.data = data; }
    public void setNext(LinkedListNode<T> next) { this.next = next; }

    public String toString() {
        java.lang.StringBuffer str = new java.lang.StringBuffer();
        LinkedListNode<T> node = this;
        while (node != null) {
            str.append("[" + node.getData().toString() + "] - ");
            node = node.getNext();
        }
        return str.toString();
    } 

}