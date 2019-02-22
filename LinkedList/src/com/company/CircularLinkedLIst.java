package com.company;

public class CircularLinkedLIst {
    private Node first;
    private Node last;

    public CircularLinkedLIst(){
        first=null;
        last=null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty())
            last=newNode;
        newNode.setNext(first); //newNode is being assigned by newNode
        first=newNode;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty()){
            first=newNode;
        }else {
            last.setNext(newNode); //the next value of the last node will point to the new node
            last=newNode; // we make the new node we created be the last node in the LinkedList
        }
    }
    public int deleteFirst(){
        int temp = first.getData();
        if(first.getNext()==null)
            last=null;
        first=first.getNext(); //first will point to old's next value

        return temp;
    }
    public void displayList(){
        Node currentNode=first;
        while (currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
