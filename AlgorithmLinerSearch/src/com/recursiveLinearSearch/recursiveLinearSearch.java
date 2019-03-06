package com.recursiveLinearSearch;

public class recursiveLinearSearch {
    public static void main(String[] args) {
        System.out.println(recursiveLinearBinarySearch(new int[]{1,2,4,5,6},4,6));
    }
    public static int recursiveLinearBinarySearch(int[]array,int i, int key){
        if(i>array.length-1) //if evaluates as true, x was not found in the array
            return -1;
        else if (array[i]==key) // if we have found it then to return the index
            return i;
        return recursiveLinearBinarySearch(array,i+1,key); // else return the launch of this function again
    }
}
