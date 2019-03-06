package com.selectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[]array=selectionSort(new int[]{3,5,32,6,5,43,2,1,5});
        for(int i=0; i<array.length;i++)
            System.out.println(array[i]);
    }
    public static int[] selectionSort(int[]array){
        for(int i=0; i<array.length;i++){
            int minimum=i; //a minimum is the element with the index i;
            for(int j=i+1;j<array.length;j++){
                if (array[j]<array[minimum]){ //if we find a smaller value
                    minimum=j; //now this is a smaller value
                }
            }
            int temp=array[i]; //swap values
            array[i]=array[minimum];
            array[minimum]=temp;

        }
        return array;
    }
}
