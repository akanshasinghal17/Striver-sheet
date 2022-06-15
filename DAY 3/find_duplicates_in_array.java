import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
    int count[]=new int[n];
        for(int i=0;i<arr.size();i++){
             count[arr.get(i)]++;
        }
        for(int i=0;i<n;i++){
            if(count[i]>1)
                return i;
        }
        return -1;
    }
}
