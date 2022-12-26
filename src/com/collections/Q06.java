package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q06 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);deque.addLast(30);deque.addLast(40);deque.addLast(30);
        deque.removeFirstOccurrence(30);
        System.out.println(deque);
    }
}
