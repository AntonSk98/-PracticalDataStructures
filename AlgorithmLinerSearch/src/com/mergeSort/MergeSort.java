package com.mergeSort;

public class MergeSort {
    void sort(int[] inputArray) {
        sort(inputArray,0,inputArray.length-1);
    }
    public static void sort(int[] array, int start, int end){
        if(end<=start){
            return; //we're done traversing the array
        }
        int mid=(start+end)/2;
        sort(array,start,mid);
        sort(array,mid+1,end);
        merge(array,start,mid,end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] tempArray=new int[end-start+1];
        int leftSide=start;
        int rightSide=mid+1;
        int k=0;
        while(leftSide<=mid && rightSide<=end){
            if(array[leftSide]<array[rightSide]){
                tempArray[k]=array[leftSide];
                leftSide++;
            }else {
                tempArray[k]=array[rightSide];
                rightSide++;
            }
            k++;
        }
        if(leftSide<=mid){
            while(leftSide<=mid){
                tempArray[k]=array[leftSide];
                leftSide++;
                k++;
            }
        }
        if(rightSide<=end){
            while(rightSide<=end){
                tempArray[k]=array[rightSide];
                rightSide++;
                k++;
            }
        }
        for(int i=0; i<tempArray.length; i++)
            array[start+i]=tempArray[i];
    }
}
