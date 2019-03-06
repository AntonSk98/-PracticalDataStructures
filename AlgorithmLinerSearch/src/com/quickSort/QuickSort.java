package com.quickSort;

public class QuickSort {
    static void quickSort(int[]array,int start,int end){
        if(start<end){
            int q = partition(array,start,end);//index position of the correctly placed value in the array
            quickSort(array,start,q-1);//sorts the left half of the range
            quickSort(array,q+1,end);
        }
    }
    static int partition(int[]array,int start,int end){
        int star = array[end];
        //in the first iteration i starts with negative one
        int i=start-1;
        for(int j=start; j<end;j++){
            if(array[j]<=star){
                i=i+1;
                int iVal=array[i];
                int jVal=array[j];
                array[i]=jVal;
                array[j]=iVal;
            }
        }
        //put the q value in the correct slot next
       int iVal=array[i+1];
       array[end]=iVal;
       array[i+1]=star; //here q is placed in the correct slot of the array
       return i+1;
    }
}
