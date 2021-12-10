package com.apnacollege;

public class copyArray {
    public static void main(String []args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]=new int[arr1.length ] ;
        for(int i=0;i< arr1.length ;i++){
            arr2 [i]=arr1 [i];
        }
        System.out.print("elements of original array are --> ");
        for(int j=0;j< arr1.length ;j++){
            System.out.print(arr1 [j]+" ");
        }
        System.out.println();
        System.out.print("elements copied to new array are --> ");
        for(int k=0;k< arr2.length ;k++){
            System.out.print(arr2 [k]+" ");
        }
    }
}
