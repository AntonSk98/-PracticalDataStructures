package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(LinearSearch.linearSearch(new int[]{1,2,4,5,6}, 2));

    }
    static int linearSearch(int array[], int key){
        for(int i=0; i<array.length;i++)
            if(array[i]==key) {
                return i;
            }
        return -1;
    }
}
