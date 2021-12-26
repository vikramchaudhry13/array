package com.apnacollege;
import java.io.* ;
import java.util.* ;
public class ArraySort {
    public static void main(String []args){
        Scanner s=new Scanner(System.in) ;
        int n=s.nextInt() ;
        int arr[]=new int[n] ;
        for (int i=0;i< arr.length ;i++){
            arr[i]=s.nextInt() ;
        }
        System.out.print("entered array elements--> ");
        for (int i=0;i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr) ;
        System.out.println();
        System.out.print("array sorted in ascending order--> ");
        for (int i=0;i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

