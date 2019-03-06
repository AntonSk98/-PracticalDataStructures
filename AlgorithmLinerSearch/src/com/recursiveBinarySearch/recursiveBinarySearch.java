package com.recursiveBinarySearch;

public class recursiveBinarySearch {
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch.binarySearch(new int[]{1,2,3,4},0,3,5));
    }
    public static int binarySearch(int[] array,int p,int r, int key){
        int q;
        System.out.println(p+".."+r);
        if(p>r)
            return -1;
        else{
            q=(p+r)/2;
            if(array[q]==key)
                return q;
            if(array[q]>key)
                return binarySearch(array,p,r-1,key);
            else
                return binarySearch(array,p+1,r,key);
        }
    }
}
