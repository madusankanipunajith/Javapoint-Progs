package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(0, "zero");myMap.put(1, "one");myMap.put(2,"two");myMap.put(3, "three");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
    }
}
