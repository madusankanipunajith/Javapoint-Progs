package com.collections;

import java.util.Vector;

public class C03 {
    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<>();
        Vector<Integer> advanceVector = new Vector<>();
        myVector.add(10);myVector.add(20);myVector.add(30);
        advanceVector.add(35); advanceVector.addAll(1, myVector);advanceVector.add(100);

        System.out.println(myVector);
        System.out.println(advanceVector);
    }
}
