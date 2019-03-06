package com.insertionSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InsertionSort {
    public static void main(String[] args) {
        int[]array = insetionSort(new int[]{3,1,6,3,2,0,-1});
        for(int i=0; i<array.length;i++)
            System.out.println(array[i]);
    }

    public static int[] insetionSort(int[]array){
        for(int i=1;i<array.length;i++){
            int element=array[i]; //the start index of unsorted part
            int j=i-1; //the last index of the sorted part
            while(j>=0 && array[j]>element){
                array[j+1]=array[j]; //shift elements
                j--;//decrement the index in the sorted part
            }
            array[j+1]=element;
        }
        return array;
    }
}
