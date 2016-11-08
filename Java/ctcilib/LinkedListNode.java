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


    /*
    * using singly linked list
    */
    public void removeDups() {
        java.util.HashMap<T,Integer> countMap = new java.util.HashMap<T,Integer>();
        if (this != null) {
            LinkedListNode<T> next = this.getNext();
            countMap.put(this.data,new Integer(1));
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