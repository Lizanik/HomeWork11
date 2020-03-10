package com.epam.task1;

import java.util.List;
import java.util.Set;

import static com.epam.task1.Collections.createList;
import static com.epam.task1.Collections.createSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = createList(15, 5, 10);
       System.out.println(list);
        Set<Integer> Set = createSet(20, 10, 50);
        System.out.println(Set);
    }
}
