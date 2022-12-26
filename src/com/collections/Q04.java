package com.collections;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Q04 {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10); myStack.push(20); myStack.push(30); myStack.push(40);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.stream().sorted().findFirst().getClass());
    }
}
