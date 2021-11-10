package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> sortIncomingQueses(List<Queue<Integer>> list) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> sortedElements = new PriorityQueue<>();
        Integer element;
        for (Queue<Integer> queue : list) {
            while (!queue.isEmpty()) {
                if ((element = queue.poll()) != null) {
                    sortedElements.add(element);
                }
            }
        }
        while (!sortedElements.isEmpty()) {
            result.add(sortedElements.poll());
        }
        return result;
    }
}
