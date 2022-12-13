package com.company;

import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime prime = new Prime();
        System.out.print("Add number : ");
        prime.number = sc.nextInt();
        System.out.println(prime.number + " is a " + prime.is_prime());
    }
}

class Prime{
    public int number;

    public boolean is_prime(){
        for (int i = 2; i < this.number; i++){
            if (this.number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean is_prime(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void display_prime(){
        for (int i = 1; i <= 50000; i ++){
            if (is_prime(i)){
                System.out.println(i);
            }
        }
    }
}
