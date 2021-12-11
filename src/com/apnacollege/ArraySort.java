package com.apnacollege;
import java.util.* ;
public class ArraySort {
    public static void main(String []args){
        int arr[]={3,6,7,9,8,4,2,5};
        Arrays.sort(arr) ;
        System.out.print("array sorted in ascending order--> ");
        for (int i=0;i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
