package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int floor = scanner.nextInt();

        do{
            int rest = floor%2;
            floor = (int) Math.floor((float)floor/2);
            stack.push(rest);
        }while (floor != 0);

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
