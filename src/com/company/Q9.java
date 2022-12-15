package com.company;


import java.util.Scanner;
import java.util.Stack;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int input = scanner.nextInt();

        int floor = 0;

        if(input == 0){
            System.out.println(0);
        }else {
            floor = input;
            while (floor != 0){
                int rest = floor%2;
                floor = (int) Math.floor((float)floor/2);
                stack.push(rest);
            }

            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }
    }
}
