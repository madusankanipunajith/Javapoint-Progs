package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Q3 {

    public boolean checkPalindrome(List<Integer> lst){
        int len = lst.size();
        int halfLen = len/2;

        for (int index = 0; index < halfLen; index ++){
            int reverseIndex = len - (index + 1);
            if (!Objects.equals(lst.get(index), lst.get(reverseIndex))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Scanner sc = new Scanner(String.valueOf(number));
        List<Integer> lst = new ArrayList<Integer>();

        // assume a big number string ;
        String str= sc.next();
        int len=str.length();

        for(int i=0; i < len; i++)
            lst.add((int) str.charAt(i)); // it gets the ascii value of the characters


        Q3 q3 = new Q3();
        boolean answer = q3.checkPalindrome(lst);
        System.out.println(answer);
    }
}
