package com.company;

public class Node {
    private int data; //every node of the SinglyLinkedList structure is composed of two elements. The firs element is
    //relevant data and the second element is a node which is refer to the next element of Linked structure
    private Node next;// this variable is to link the next data
    private Node last;
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
