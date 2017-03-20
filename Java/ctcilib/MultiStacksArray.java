package ctcilib;

public class MultiStacksArray<T extends Comparable<T>> {

     private LinkedListNode<T> contents;

     public MultiStacksArray() {
             contents = new LinkedListNode<>();
     }

     public void push(T item) throws NullPointerException, IllegalArgumentException{
          contents.add(item); //add to tail
     }

     public T pop() throws IndexOutOfBoundsException {
          return contents.remove(contents.size() - 1); //remove from tail
     }

      @Override
      public String toString() {
            return contents.toString();
      }
}