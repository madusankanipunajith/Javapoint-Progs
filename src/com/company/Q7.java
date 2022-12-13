package com.company;

// call by reference
public class Q7 {

    public void change(TInteger integer){
        integer.number = 20;
    }
    public static void main(String[] args) {
        TInteger tInteger = new TInteger(10);
        Q7 q7 = new Q7();
        q7.change(tInteger);

        System.out.println(tInteger.number);
    }
}

class TInteger{
    public int number;

    public TInteger(int num){
        this.number = num;
    }
}
