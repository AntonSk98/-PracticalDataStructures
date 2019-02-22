package com.company;

public class Node {
    private int data;
    private Node next;
    private Node previous;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void displayNode(){
        System.out.println("{"+data+"}");
    }
}
