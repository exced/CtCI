package ctcilib;

/*
* Simple Linked List
*/
public class LinkedListNode<T> {

    private T data;
    private LinkedListNode next;

    public LinkedListNode() {    
    }

    public T getData() { return data; }
    public LinkedListNode getNext() { return next; }
    public void setData(T data) { this.data = data; }
    public void setNext(LinkedListNode next) { this.next = next; }

}