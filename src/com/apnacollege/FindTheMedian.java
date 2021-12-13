package com.apnacollege;
import java.util.*;
import java.io.*;
public class FindTheMedian {
    public static void main(String args[]) {
        //your code here
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array 'n' followed by respective elements ");
        int n=s.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("sorted array--> ");
        for (int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();
        int m=(arr.length/2)+1;
//        System.out.println(m);
        System.out.println("median is--> "+arr[m-1]);
    }
}
