package com.mergeSort;

public class main {
    public static void main(String[] args) {
        int[] inputArray={4,3,54,23,1,2,0,-2,150};
        MergeSort sorter = new MergeSort();
        sorter.sort(inputArray);
      for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }
}
