package knearest;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class KNearest {

    /**
     * Given a list of points, find the k nearest points to another given point.
     */
    public static List<Point> kNearest(List<Point> points, Point other, int k) {
        /* custom heap that has Map: Distance - Point, Point use distance as custom comparator */
        PriorityQueue<DistanceMap> heap = new PriorityQueue<DistanceMap>(new Comparator<DistanceMap>() {
            public int compare(DistanceMap a, DistanceMap b) {
                return Double.compare(a.getDistance(), b.getDistance());
            }
        });
        for (Point p : points) {
            double distance = p.distance(other);
            if (heap.size() < k) {
                heap.add(new DistanceMap(distance, p));
            } else {
                if (distance < heap.peek().getDistance()) {
                    heap.poll();
                    heap.add(new DistanceMap(distance, p));
                }
            }
        }
        List<Point> kNearest = Arrays.asList(heap.toArray()).stream()
        .map(d -> ((DistanceMap) d).getPoint())
        .collect(Collectors.toList());
        return kNearest;
    }

    public static void main(String[] args) {
        Point origin = new Point(0, 0);
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        points.add(new Point(3, 1));
        points.add(new Point(2, 4));
        List<Point> knearest = kNearest(points, origin, 2);
        System.out.println(knearest.toString());
    }
}