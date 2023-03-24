package com.epam.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> q = new ArrayList<>(firstList);
        List<String> w = new ArrayList<>(secondList);

        q.addAll(w);
        Collections.sort(q);
        Collections.reverse(q);
        Comparator<String> qw = Comparator.reverseOrder();
        PriorityQueue<String> queue = new PriorityQueue<>(qw);
        queue.addAll(q);

        return queue;
    }
}
