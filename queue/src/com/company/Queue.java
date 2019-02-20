package com.company;

public class Queue {
    private int maxSize; //initializes the set number of slots
    private long[] queueArray; // slots to main the data;
    private int front; //this is the index position for the element in the front
    private int rear; //this is the index position for the element at the back of the line
    private int nItems; //counter to maintain the number of items in our queue
    public Queue(int size){
        this.maxSize=size;
        queueArray=new long[size];
        front=0; // the index position of the first slot of the array
        rear=-1; // there is no item in the array yet to be considered as the last item
        nItems=0; //don't have elements in the array yet
    }
    public void insert(long j){ //put items in the end of the queue
        if(rear==maxSize-1)//Circular queue
            rear=-1; //if you reach the maxSize the elements start to be overwritten
        rear++;
        queueArray[rear]=j;
        nItems++;

    }
    public long peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize);
    }
    public long remove(){ //remove the item from the front
        long temp = queueArray[front];
        front++;
        if(front==maxSize){
            front=0;//we can set front back to 0th index so that we can utilize the entire array again
        }
        nItems--;
        return temp;
    }
    public void view(){
        System.out.print("[ ");
        for (long aQueueArray : queueArray) {
            System.out.print(aQueueArray + " ");
        }
        System.out.print("]");

    }

}
