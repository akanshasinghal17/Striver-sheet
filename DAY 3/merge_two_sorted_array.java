import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i=0,j=0;
       while(i!=m){
           if(arr1[i]<arr2[j])
               i++;
           else{
               int temp=arr1[i];
               arr1[i]=arr2[j];
               arr2[j]=temp;
               Arrays.sort(arr2);
               i++;
           }   
       }
        for(int k=0;k<n;k++){
            arr1[i]=arr2[k];
            i++;
        }
        return arr1;
    }



public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int arr3[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i!=m){
            arr3[k++]=arr1[i++];
        }
        while(j!=n)
            arr3[k++]=arr2[j++];
        Arrays.sort(arr3);
        return arr3;
    }


public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int arr3[]=new int[m+n];
        int k=0,j=0,i=0;
                 while(i!=m && j!=n){
                if(arr1[i]<arr2[j])
                    arr3[k++]=arr1[i++];
                else
                    arr3[k++]=arr2[j++];
                 }
            while(i!=m){
                    arr3[k++]=arr1[i++];
            }
        while(j!=n){
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }



}














}
