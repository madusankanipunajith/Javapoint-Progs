package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q05 {
    public static void main(String[] args) {
        PriorityQueue<String> queue= new PriorityQueue<String>();
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        queue.add("Mango");queue.add("Avacado");queue.add("Cherry");queue.add("Banana");
        myQueue.add(100);myQueue.add(20);myQueue.add(50);myQueue.add(200);myQueue.add(456);

        //print element of the top index
        System.out.println(queue);
        System.out.println(myQueue);
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());

        //iterating the queue elements
        System.out.println("iterating the queue elements:");
        Iterator itr1=queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        //remove the elements
        queue.remove();
        queue.poll();

        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
