package com.apnacollege;

public class smallestInArray {
    public static void main(String []args){
        int arr[]={5,8,9,2,4,6,3};
        int temp;
        System.out.print("original array --> ");
        for(int i=0;i< arr.length ; i++){
            System.out.print(arr[i]+" ");// prints original array
        }
        for(int j=0;j< arr.length ;j++){
            for(int k=j+1;k< arr.length ;k++){
                if(arr[j]< arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];//smaller element is put in place of greater element.
                    arr[k]=temp;//greater element is put in place of smaller element.
                }
            }
        }
        System.out.println();
        System.out.print("sorted in descending order --> ");
        for(int l=0;l< arr.length ;l++){
            System.out.print(arr[l]+" ");
        }
        System.out.println();
        System.out.print("smallest element--> "+arr[arr.length -1]);
        System.out.println();
        System.out.print("2nd smallest element--> "+arr[arr.length -2]);
    }
}
