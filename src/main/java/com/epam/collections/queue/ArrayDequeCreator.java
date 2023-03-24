package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
            ArrayDeque<Integer> qwe = new ArrayDeque<>();
        ArrayDeque<Integer> qw = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> e = new ArrayDeque<>(secondQueue);

        qwe.add(qw.pollFirst());
        qwe.add(qw.pollFirst());
        qwe.add(e.pollFirst());
        qwe.add(e.pollFirst());

        while (qw.peek() != null) {
            qw.addLast(qwe.pollLast());
            qwe.add(qw.pollFirst());
            qwe.add(qw.pollFirst());
            e.addLast(qwe.pollLast());
            qwe.add(e.pollFirst());
            qwe.add(e.pollFirst());
        }
        return qwe;
    }
}
