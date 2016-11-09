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

    public LinkedListNode<T> kth2End(int k) {
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

    public boolean removeNode() {
        if (next == null)
            return false;
        data = next.getData();
        next = next.getNext();            
        return true;
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