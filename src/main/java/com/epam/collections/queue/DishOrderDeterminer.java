package com.epam.collections.queue;

import java.util.List;
import java.util.ArrayList;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> qwe = new ArrayList<>();
        int a = 1;

        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            for ( int i = 0; i < list.size(); i++) {
                if (a % everyDishNumberToEat == 0) {
                    qwe.add(list.get(i));
                    list.remove(i);
                    i--;
                }
                a++;
            }
        }

        return qwe;
    }
}
