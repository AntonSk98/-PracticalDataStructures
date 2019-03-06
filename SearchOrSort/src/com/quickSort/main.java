package com.quickSort;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] inputArray ={1,23,543,523,4,324,13123,24,532,1,2,4,6,3,2};
        QuickSort.quickSort(inputArray,0,inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }
}
