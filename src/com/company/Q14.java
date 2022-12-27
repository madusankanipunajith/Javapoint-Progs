package com.company;

import java.util.*;

public class Q14 {

    public static int i =1;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        while (i <= 10){
            myList.add(i);
            i++;
        }

        for(int i =0; i < myList.size(); i+=2){
            deque1.add(myList.get(i));
            stack.push(myList.get(i+1));
        }

        List<Integer> result = new ArrayList<>(deque1);
        int size = stack.size();

        for (int i=0; i < size; i++){
            result.add(stack.pop());
        }

        System.out.println(result);
    }
}
