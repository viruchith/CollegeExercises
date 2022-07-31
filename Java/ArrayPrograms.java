// Write a program to find intersection of two sorted arrays in Java?

import java.util.*;

public class Main
{
    public static List<Integer> intersection(int[] arr1,int[] arr2){
        int i1 = 0 , i2 = 0;
        
        List<Integer> result = new ArrayList<>();
        
        while(i1<arr1.length && i2<arr2.length){
            if(arr1[i1]<arr2[i2]){
                i1++;
            }else if(arr1[i1]>arr2[i2]){
                i2++;
            }else{
                result.add(arr1[i1]);
                i1++;
                i2++;
            }
        }
        
        return result;
    }
    
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 3, 4, 5, 6} , arr2 = {3, 3, 5};
		
		System.out.println(intersection(arr1,arr2));
		
		//output : [3, 3, 5]
	}
}


//-----------------------------------------------------------------------------------------------------------------
