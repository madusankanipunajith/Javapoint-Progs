package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q07 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> sortedSet = new TreeSet<>();

        mySet.add(10);
        mySet.add(20);
        mySet.add(null);
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(2);

        System.out.println(mySet);
        System.out.println(sortedSet);
    }
}
