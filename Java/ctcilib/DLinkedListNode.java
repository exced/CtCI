package ctcilib;

/*
* Doubly Linked List
*/
public class DLinkedListNode<T> {

    private T data;
    private DLinkedListNode<T> next;
    private DLinkedListNode<T> previous;

    public DLinkedListNode() {    
    }

    public DLinkedListNode(T data) {
        this.data = data;
    }

    public T getData() { return data; }
    public DLinkedListNode<T> getNext() { return next; }
    public DLinkedListNode<T> getPrevious() { return previous; }
    public void setData(T data) { this.data = data; }
    public void setNext(DLinkedListNode<T> next) { 
        this.next = next;
        next.setPrevious(this); 
    }
    public void setPrevious(DLinkedListNode<T> previous) { 
        this.previous = previous;
        previous.setNext(this); 
    }

    public String toString() {
        java.lang.StringBuffer str = new java.lang.StringBuffer();
        DLinkedListNode<T> node = this;
        while (node != null) {
            str.append("[" + node.getData().toString() + "] - ");
            node = node.getNext();
        }
        return str.toString();
    } 

}