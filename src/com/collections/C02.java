package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        List<String> srtList = new LinkedList<>();
        srtList.add("Madusanka"); srtList.add("Nipunajith");

        Iterator<String> iterator = srtList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        srtList.add(1, "WSO2");

        System.out.println(srtList);
    }
}
