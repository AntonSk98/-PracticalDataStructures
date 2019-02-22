package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertAfter(30,100);
        list.deleteKey(10);
        list.displayBack();
    }
}
