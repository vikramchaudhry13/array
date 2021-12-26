package com.apnacollege;
import java.util.*;
import java.io.*;
public class FindTheMedian {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array 'n' followed by respective elements ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("sorted array--> ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if (n % 2 != 0){
            int m = (arr.length / 2) + 1;
            System.out.println("median is--> " + arr[m - 1]);
        }else{
            int o=(arr.length/2);
            double ans=(double) (arr[o]+arr[o-1])/2;
            System.out.print("median is-->");
            System.out.printf("%.2f",ans);
        }
    }
}
