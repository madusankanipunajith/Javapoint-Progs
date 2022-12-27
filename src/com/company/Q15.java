package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // define data structures
        Stack<Integer> stack = new Stack<>();

        for (int index=1; index <= input; index++){
            String line = "";stack.clear();
            for (int letter = 1; letter <= index ; letter++){
                line = line.concat(String.valueOf(letter));
            }
            for (int letter = 1; letter < index; letter++){
                stack.push(letter);
            }
            int length = stack.size();
            for(int i=0; i < length; i++){
                line = line.concat(String.valueOf(stack.pop()));
            }

            System.out.println(line);

        }
    }
}
