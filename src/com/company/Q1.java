package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibboncci fibboncci = new Fibboncci();
        Fibbo_non_recursion fibbo_non_recursion = new Fibbo_non_recursion();

        System.out.print("Add Input : ");
        fibboncci.number = sc.nextInt();

        // first method
        for (int i = 0; i < fibboncci.number; i++) {
            System.out.print(fibboncci.fibbo(i)+ " ");
        }

        System.out.println();
        // second method
        for (int i = 0; i < fibboncci.number; i++) {
            System.out.print(fibbo_non_recursion.fibbo(i)+ " ");
        }
    }
}

class Fibboncci{
    public int number;

    public int fibbo(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }

        return fibbo(number - 1) + fibbo(number -2);
    }
}

class Fibbo_non_recursion{
    public int fibbo(int number){
        List<Integer> fibList = new ArrayList<>();
        fibList.add(0);
        fibList.add(1);

        if (number == 0) return fibList.get(0);
        if (number == 1) return fibList.get(1);

        int current_index;
        int prev_index;
        int next_index;

        for(int i = 1; i < number; i++){
               current_index = i;
               prev_index = i - 1;
               next_index = i + 1;
               fibList.add(next_index, fibList.get(current_index) + fibList.get(prev_index));
        }

        return fibList.get(number);
    }
}