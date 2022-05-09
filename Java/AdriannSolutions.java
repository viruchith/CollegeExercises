// Write a function that returns the largest element in a list.

import java.util.*;


public class Main
{
    public static int largestNumberInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>max){
                max = num;
            }
        }
        
        return max;
    }
	public static void main(String[] args) {
		int[] arr = {101,45,6,78,233,2,5,7,14,56};
		System.out.println(largestNumberInArray(arr));
	}
}


// Write function that reverses a list, preferably in place.

import java.util.*;


public class Main
{
    public static void reverseArrayInPlace(int[] arr){
        int l = 0 , r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		reverseArrayInPlace(arr);
		System.out.println(Arrays.toString(arr));
	}
}

// Write a function that checks whether an element occurs in a list.

import java.util.*;


public class Main
{
    public static boolean arrayContainsElement(int[] arr,int num){
        int l = 0 , r = arr.length-1 ;
        while(l<r){
            if(arr[l] == num || arr[r] == num){
                return true;
            }
            l++;r--;
        }
        
        return false;
    }
    
    
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrayContainsElement(arr,7));
	}
}

// Write a function that returns the elements on odd positions in a list.

import java.util.*;

public class Main
{
    // Generic
    public static <T> List<T> getElementsAtOddPositions(List<T> list){
        List<T> filteredList = new ArrayList<>();
        for(int i = 0 ; i<list.size() ; i+=2){
            filteredList.add(list.get(i));
        }
        
        return filteredList;
    }
    
	public static void main(String[] args) {
	    List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9);
	    System.out.println(getElementsAtOddPositions(numbersList));
	}
}

