package com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new int[]{4,3,5,2},2));
    }
    public static int binarySearch(int[] array, int key){
        int answer=-1;
        int p=0;
        int r=array.length-1; //the maximum index of the array
        while(p<=r){
            int q=(p+r)/2;
            if(array[q]==key)
                return q;
            if(array[q]>key)
                r=q-1;
            else
                p=q+1;
        }
        return answer;
    }
}
