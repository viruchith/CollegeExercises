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
