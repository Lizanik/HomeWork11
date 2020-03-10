package com.epam.task1;

import java.util.*;

public class Collections {
    public static List createList(int num, int min, int max) {
        List<Integer> list = new ArrayList<>();
        int range = max - min;
        for (int i = 0; i < num; i++)
            list.add((int) (Math.random() * range) + min);
        return list;
    }

    public static Set createSet(int num, int min, int max) {
        Set<Integer> Set = new HashSet<>();
        int range=max-min;
        if (num > range)
            throw new ArithmeticException("");
        for (int i = 0; i < num; i++)
            Set.add((int) (Math.random() * range) + min);
        return Set;
    }

}