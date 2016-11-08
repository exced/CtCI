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
        next.setPrevious(this);
        this.next = next; 
    }
    public void setPrevious(DLinkedListNode<T> previous) { 
        this.previous = previous; 
    }

    /*
    * using double linked list
    */
    public void removeDups() {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (this != null) {
            DLinkedListNode<T> next = this.getNext();
            countMap.put(this.data,new Integer(1));
            while(next != null) {
                T data = next.getData();
                if (countMap.containsKey(data))
                    if (next.getNext() == null)
                        this.setNext(new DLinkedListNode<T>());
                    else   
                        this.setNext(next.getNext());
                else
                    countMap.put(data, new Integer(1));
                next = next.getNext();                    
            }
        }        
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