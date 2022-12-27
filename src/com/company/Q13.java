package com.company;

import java.util.*;

public class Q13 {
    static int i =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        Stack<Character> stack = new Stack<>();
        ArrayDeque<String> resultList = new ArrayDeque<>();
        int input = scanner.nextInt();

        for (int index = 1; index <= input; index++){
            String line = "";
            stack.clear();

            // concat the first half of the string
            for (int letter = 0; letter < index ; letter++){
                line = line.concat(String.valueOf(alpha[letter]));
            }
            // push to the stack
            for (int iterator = 0; iterator < index -1; iterator++){
                stack.push(alpha[iterator]);
            }
            // concat the rest of the chars by popping the stack
            for(int iterator = index; iterator > 1; iterator--){
                line = line.concat(String.valueOf(stack.pop()));
            }

            resultList.add(line);
        }

        // printing according to the given output
        for(int itr = input-1; itr >= 0; itr--){
            String line = "";
            for(int i = 0; i < itr; i++){
                line = line.concat(" ");
            }
            line = line.concat(resultList.pop());
            System.out.println(line);
        }

    }
}
