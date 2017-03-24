public class Stack2<T> {

    public static class EmptyStackException extends Exception {
        public EmptyStackException(String msg) {
            super(msg);
        }
    }

    private static class StackNode<T> {
        private T data;
        private StackNode next;
        public StackNode(T data) {
            this.data = data;
        }
    }
    
    private StackNode<T> top;
    
    public void push(T data) {
        StackNode<T> newTop = new StackNode<T>(data);
        newTop.next = top;
        top = newTop;
    }
    
    public boolean isEmpty() {
        return this.top == null;
    }
    
    public T peek() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException("Empty stack");
        }
        return this.top.data;
    }
    
    public T pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException("Empty stack");
        }
        T data = this.top.data;
        this.top = this.top.next;
        return data;
    }    
    
}