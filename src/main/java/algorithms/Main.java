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
//        PriorityQueue<Integer> sortedElements = new PriorityQueue<>();
//        Integer element;
        boolean hasValues = true;
        while (hasValues) {
            int tempMin = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).isEmpty() && list.get(i).peek() < tempMin) {
                    index = i;
                    tempMin = list.get(i).peek();
                }
            }
            result.add(list.get(index).poll());
            hasValues = checkQueue(list);
        }
        return result;

//        for (Queue<Integer> queue : list) {
//            while (!queue.isEmpty()) {
//                if ((element = queue.poll()) != null) {
//                    sortedElements.add(element);
//                }
//            }
//        }
//        while (!sortedElements.isEmpty()) {
//            result.add(sortedElements.poll());
//        }
//        return result;
    }

    private static boolean checkQueue(List<Queue<Integer>> list) {
        int count = 0;
        for (Queue<Integer> queue : list) {
            if (queue.isEmpty()){
                count++;
            }
        }

        return count != list.size();
    }
}
