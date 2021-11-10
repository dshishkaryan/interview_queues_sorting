package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Tests {
    @Test
    public void testForQueuesWithSameSize() {

        ArrayDeque<Integer> queue1 = new ArrayDeque<>(Arrays.asList(1, 6, 10, 20));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(Arrays.asList(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(Arrays.asList(49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(Arrays.asList(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());


        List<Integer> actualResultList = Main.sort(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    public void testForQueuesWithDifferentSizes() {
        ArrayDeque<Integer> queue1 = new ArrayDeque<>(Arrays.asList(1, 10, 20));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(Arrays.asList(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(Arrays.asList(-19, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(Arrays.asList(25, 84, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());



        List<Integer> actualResultList = Main.sort(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    public void testForQueuesWithEmptyQueue(){
        ArrayDeque<Integer> queue1 = new ArrayDeque<>(Arrays.asList(1, 6, 10, 20, 100));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(Arrays.asList());
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(Arrays.asList(10, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(Arrays.asList(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());
        List<Integer> actualResultList = Main.sort(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }

    @Test
    public void testForQueuesWithEqualsElements() {

        ArrayDeque<Integer> queue1 = new ArrayDeque<>(Arrays.asList(1, 6, 10, 20, 100));
        ArrayDeque<Integer> queue2 = new ArrayDeque<>(Arrays.asList(0, 2, 7, 42));
        ArrayDeque<Integer> queue3 = new ArrayDeque<>(Arrays.asList(10, 49, 73, 100, 420));
        ArrayDeque<Integer> queue4 = new ArrayDeque<>(Arrays.asList(25, 84, 110, 422));
        List<Object> sortedValues = Stream.of(queue1, queue2, queue3, queue4).flatMap(Collection::stream).sorted().collect(Collectors.toList());


        List<Integer> actualResultList = Main.sort(List.of(queue1, queue2, queue3, queue4));

        Assertions.assertEquals(sortedValues, actualResultList);
    }
}