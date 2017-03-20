package ctcilib;

public class Stack<T extends Comparable<T>> {

    LinkedListNode<T> top;

    public Stack(T data){
        this.top = new LinkedListNode<T>(data);
    }

    public T pop() throws IndexOutOfBoundsException{
        if (this.top == null)
            throw new EmptyStackException();
        T data = this.top.getData();
        this.top = this.top.getNext();
        return data;
    }

    public boolean empty(){
        return this.top == null;
    }

    public T peek() throws EmptyStackException {
        if (this.top == null)
            throw new EmptyStackException();       
        return this.top.getData();
    }

    public void push(T data){
        if (this.top == null)
            this.top = new LinkedListNode<T>(data);
        this.top.setNext(new LinkedListNode<T>(data));
        this.top = this.top.getNext();
    }
}