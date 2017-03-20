package ctcilib;

public class Queue<T extends Comparable<T>> {

    LinkedListNode<T> head;
    LinkedListNode<T> tail;

    public Queue(T data) {
        this.head = new LinkedListNode<T>(data);
        this.tail = null;
    }

    public void push(T data) {
        if (this.tail == null)
            this.head.setNext(new LinkedListNode<T>(data));
        this.tail.setNext(new LinkedListNode<T>(data));
        this.tail = this.tail.getNext();
    }

    public T peek() throws IndexOutOfBoundsException {
        if (head == null) 
            throw new IndexOutOfBoundsException();        
        return this.head.getData();
    }

    /* remove head */
    public T pop() throws IndexOutOfBoundsException {
        if (head == null) 
            throw new IndexOutOfBoundsException();
        T data = this.head.getData();
        this.head = this.head.getNext();
        if (this.head.equals(this.tail))
            this.tail = null;
        return data;
    }

    public boolean empty() {
        return this.head == null;
    }

}