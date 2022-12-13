package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    public static boolean is_armstrong(List<Integer> lst, int number){
        System.out.println(lst);
        int result = 0;
        for (int index = 0; index < lst.size(); index++){
            result += Math.pow(lst.get(index), lst.size());
        }

        return result == number;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(String.valueOf(scanner.nextInt()));
        List<Integer> lst = new ArrayList<>();

        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < len; i++){
            lst.add(Integer.parseInt(str.charAt(i)+""));
        }

        System.out.println(Q4.is_armstrong(lst, Integer.parseInt(str)));
    }
}
