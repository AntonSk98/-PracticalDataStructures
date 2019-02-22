package com.company;

public class SinglyLinkedList {
    private Node first;
    public SinglyLinkedList(){

    }
    public boolean isEmpty(){
        return (first==null);
    }
    //used to insert at the beginning of the List
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(first);
        first=newNode;
    }
    public Node deleteFirst(){
        Node temp = first;
        first = first.getNext();
        return temp;
    }
    public void displayList(){
        System.out.println("List (first-->last)");
        Node currentNode = first;
        while(currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }
    public void insertLast(int data){ //not an efficient way, because the time is O(n)
        Node current = first;
        while(current.getNext()!=null){
            current = current.getNext(); //we'll loop untill current.getNext() is null
        }
        Node newNode = new Node();
        newNode.setData(data);
        current.setNext(newNode);

    }
}
