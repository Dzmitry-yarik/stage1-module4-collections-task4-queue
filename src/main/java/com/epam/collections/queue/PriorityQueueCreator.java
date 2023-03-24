package com.epam.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
            firstList.addAll(secondList); //соединяем две коллекции

        Collections.sort(firstList); //сортируем коллекцию
        Collections.reverse(firstList); //переворачиваем

        //переопределям компаратор (чтобы сортировал элементы в алфавитном обратном порядке
        Comparator<String> qw = Comparator.reverseOrder();

        //передвем очереди компаратор по которому нужно сортировать
        PriorityQueue<String> queue = new PriorityQueue<>(qw);
        queue.addAll(firstList); //передаем очереди коллекцию

        return queue;
    }
}
