package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Tests {
    @Test
    void testForQueuesWithSameSize() {

        ArrayDeque<Integer> queue1 = new ArrayDeque<>(List.of(1, 6, 10, 20));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(List.of(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(List.of(49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(List.of(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());


        List<Integer> actualResultList = Main.sortIncomingQueses(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    void testForQueuesWithDifferentSizes() {
        ArrayDeque<Integer> queue1 = new ArrayDeque<>(List.of(1, 10, 20));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(List.of(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(List.of(-19, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(List.of(25, 84, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());


        List<Integer> actualResultList = Main.sortIncomingQueses(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    void testForQueuesWithEmptyQueue() {
        ArrayDeque<Integer> queue1 = new ArrayDeque<>(List.of(1, 6, 10, 20, 100));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(List.of());
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(List.of(10, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(List.of(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());
        List<Integer> actualResultList = Main.sortIncomingQueses(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    void testForQueuesWithEqualsElements() {

        ArrayDeque<Integer> queue1 = new ArrayDeque<>(List.of(1, 6, 10, 20, 100));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(List.of(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(List.of(10, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(List.of(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());


        List<Integer> actualResultList = Main.sortIncomingQueses(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }
}