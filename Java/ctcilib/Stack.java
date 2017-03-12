package ctcilib;

public class Stack<T extends Comparable<T>> {

    LinkedListNode<T> top;

    public Stack(T data){
        this.top = new LinkedListNode<T>(data);
    }

    public T pop(){
        if (this.top == null)
            return null;
        LinkedListNode<T> top_ = this.top;            
        this.top = this.top.getNext();
        return top_.getData();
    }

    public T peek(){
        return this.top.getData();
    }

    public void push(T data){
        if (this.top == null)
            this.top = new LinkedListNode<T>(data);
        this.top.setNext(data);
        this.top = this.top.getNext();
    }
}