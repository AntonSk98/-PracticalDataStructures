package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(5);
        queue.insert(6);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(10);
        System.out.println(queue.remove());
        queue.view();

    }
}
