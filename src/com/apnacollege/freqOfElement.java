package com.apnacollege;

public class freqOfElement {
    public static void main(String []args){
        int arr[]={1,2,8,3,2,2,2,5,1};
        int fr[]=new int[arr.length ] ;
        int visit=-1;
        for(int i=0;i< arr.length ;i++){
            int c=1;
            for(int j=i+1;j< arr.length ;j++){
                if(arr[i]==arr[j]){
                    c++;
                    fr[j]=visit;
                }
            }
            if(fr[i]!=visit){
                fr[i]=c;
            }
        }
        System.out.println("Element -->  Frequency");
        for(int k=0;k< fr.length ;k++){
            if(fr[k] != visit){
                System.out.println("  "+arr[k] + "     -->    "+fr[k]);
            }
        }
    }
}
