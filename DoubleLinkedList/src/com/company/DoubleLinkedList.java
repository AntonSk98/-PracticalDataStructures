package com.company;

public class DoubleLinkedList {
    private Node first;
    private Node last;
    public DoubleLinkedList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty())
            last=newNode;
        else {
            first.setPrevious(newNode);
        }
        newNode.setNext(first);
        this.first=newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty())
            first=newNode;
        else{
            last.setNext(newNode);
            newNode.setPrevious(last);
        }
        last=newNode;
    }
    //assume non-empty list
    public Node deleteFirst(){
        Node temp=first; //to save information about the first element in the list
        if(first.getNext()==null){
            last=null;
        } // there is only one item in the list
        else {
           first.getNext().setPrevious(null);
        }
        first=first.getNext(); //refers to the next node
        return temp; //return the deleted old-first node
    }
    //assume non-empty list
    public Node deleteLast(){
        Node temp=last;
        if(first.getNext()==null)
            first=null;
        else
            last.getPrevious().setNext(null);
        last = last.getPrevious();
        return temp;
    }
    //assume non-empty list
    public boolean insertAfter(int key, int data){
        Node cuurent = first; //we start from the beginning of the list
        while(cuurent.getData()!=key){
            cuurent=cuurent.getNext();
            if(cuurent==null)
                return false;
        }
        Node newNode = new Node();
        newNode.setData(data);
        if(cuurent==last){
            cuurent.setNext(null);
            last=newNode;
        }else {
            Node newNodeNext;
            newNodeNext=cuurent.getNext(); //new node's next field should point to the node ahead of the current one
            newNode.setNext(newNodeNext);
            cuurent.getNext().setPrevious(newNode);
        }
        newNode.setPrevious(cuurent);
        cuurent.setNext(newNode);
        return true;
    }
    //assume non-empty list
    public Node deleteKey(int key){
        Node cuurent = first;
        while (cuurent.getData()!=key){
            cuurent=cuurent.getNext();
            if(cuurent==null)
                return null;
        }
        if(cuurent==first) {
            first=cuurent.getNext();
        }
        else if(cuurent==last){
            last=cuurent.getPrevious();
            cuurent.getPrevious().setNext(null);
        }else{
            Node previousNext = cuurent.getPrevious();
            cuurent.getPrevious().setNext(cuurent.getNext());
            previousNext.setNext(cuurent.getNext());
        }
        return cuurent;
    }
    public void displayForward(){
        Node currentNode = first;
        while(currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }

    public void displayBack(){
        Node currentNode = last;
        while(currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode=currentNode.getPrevious();
        }
    }

}
