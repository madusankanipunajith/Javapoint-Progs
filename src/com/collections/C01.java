package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class C01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        CopyOnWriteArrayList<String> synchronizeList = new CopyOnWriteArrayList<>();
        List<Integer> containList = new ArrayList<>();

        containList.add(10);
        myList.add(100);myList.add(20);myList.add(120);
        strList.add("Madusanka");strList.add("Nipunajith");strList.add("Sandu");
        synchronizeList.add("Ruwan");synchronizeList.add("Kasun");synchronizeList.add("WSO2");
        myList.add(0,30);

        boolean result = myList.containsAll(containList);
        System.out.println(result);
        System.out.println(myList.stream().map(x-> 2*x).collect(Collectors.toList()));
        System.out.println(myList.stream().sorted().collect(Collectors.toList()));
        System.out.println(strList.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList()));
        System.out.println(strList.stream().filter(s -> s.startsWith("M")).count());
        System.out.println(myList.stream().map(x-> 2*x).sorted().findFirst().get());
        System.out.println(myList);


        // Iterator
        for (Integer integer : myList) {
            System.out.print(integer.toString()+" ");
        }

        for (String string : synchronizeList){
            System.out.print(string+' ');
        }
    }
}
