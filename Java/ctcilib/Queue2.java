public class Queue2<T> {

    private static class EmptyQueueException {
        public EmptyQueueException(String msg) {
            super(msg);
        }
    }

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;
        public QueueNode(T data) {
            this.data = data;
        }
    }
    
    private QueueNode<T> head;
    
    public Queue<T>(T data) {
        this.head = new QueueNode<T>(data);
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    public void add(T data) {
        if (this.isEmpty())
            this.head = new QueueNode<T>(data);
        else
            this.head.next = new QueueNode<T>(data);
    }
    
    public T peek() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException("Empty queue");
        return this.head.data;
    }
    
    public T remove() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException("Empty queue");
        T data = this.head.data;
        this.head = this.head.next;
        return data;
    }    

}