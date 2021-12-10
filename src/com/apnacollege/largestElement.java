package com.apnacollege;

public class largestElement {
    public static void main(String[] args) {
        int arr[] = {25, 20, 40, 70, 90, 50};
        int m = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.print("largest element --> ");
        System.out.print(m);
    }
}
