package com.apnacollege;

public class reverseArray {
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6};
        System.out.println("original array");
        for(int i=0;i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("reversed array");
        for(int j= arr.length -1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
