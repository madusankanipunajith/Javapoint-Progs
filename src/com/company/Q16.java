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
        String str = new String(String.valueOf(input)); int length = str.length();

        while(length != 0){
            int power = (int) Math.pow(10, length-1);
            int result = input/power; input = input%power;
            System.out.print(myMap.get(result)+" ");
            length--;
        }
    }
}
