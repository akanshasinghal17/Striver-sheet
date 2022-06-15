import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i],hmap.get(arr[i])+1);
            else
                hmap.put(arr[i],1);
        }
        for(int i=0;i<hmap.size();i++)
        {
if(hmap.get(arr[i])>n/2)
    return arr[i];
        }
        return -1;
        
        
    }
}