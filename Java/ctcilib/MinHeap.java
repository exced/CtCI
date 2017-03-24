package ctcilib;

import java.util.PriorityQueue;
import java.util.Comparator;

public class MinHeap {

    PriorityQueue<Integer> minHeap;

    public MinHeap() {
        this.minHeap = new PriorityQueue<Integer>(
            new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return -1*a.compareTo(b);
                } 
            }
        );
    }
}