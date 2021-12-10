package com.apnacollege;

public class largestInArray {
    public static void main(String []args){
        int arr[]={3,5,8,7,9,2,4};
        int temp;
        System.out.print("original array--> ");
        for(int i=0;i< arr.length  ;i++){
            System.out.print(arr[i]);
        }
        for(int j=0;j< arr.length ; j++){
            for(int k=j+1;k< arr.length ; k++){
                if(arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("sorted array--> ");
        for(int l=0;l< arr.length ;l++){
            System.out.print(arr[l]);
        }
        System.out.println();
        System.out.print("largest element--> " +arr[arr.length-1]);
        System.out.println();
        System.out.print("2nd largest--> "+arr[arr.length -2]);
        System.out.println();
        System.out.println("3rd largest--> "+arr[arr.length -3]);
    }
}
