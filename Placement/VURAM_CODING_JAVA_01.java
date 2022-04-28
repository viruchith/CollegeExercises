// Print a prime numbers between 100 and 200 and logic explanation.
public class Main
{
	public static void main(String[] args) {
		int start = 100 , end = 200;
		
		for(int i = start ; i <= end ; i++ ){
		    boolean prime = true;
		    for(int j = 2 ; j < i/2 ;j++ ){
		        if(i%j == 0){
		            prime = false;
		            break;
		        }
		    }
		    
		    if(prime){
		        System.out.println(i);
		    }
		}
	}
}



// find the index of a letter from a given string
public class Main
{
	public static void main(String[] args) {
	    String s = "hello world";
	    
	    char letter = 'w';
	    
	    char[] arr = s.toCharArray();
	    
	    int l = 0 , r = arr.length-1;
	    
	    while(l<r){
	        if(arr[l]==letter){
	            System.out.println(l);
	        }
	        
	        l++;

	        
	        if(arr[r]==letter){
	            System.out.println(r);
	        }
	        r--;
	    }
	}
}


// Print the numbers between 100 and 200 when they have 3 in them
public class Main
{
	public static void main(String[] args) {
	    int start = 100 , end = 200 , target = 3 ;
	    
	    for(int i = start ; i<=end ; i++ ){
	        int temp = i;
	        
	        boolean found = false;
	        
	        while(temp>0){
	            int digit = temp % 10;
	            
	            if(digit == target){
        	         found = true;
        	         break;
	            }
	            
	            temp = temp / 10;
	        }
	        
	        if(found){
	            System.out.println(i);
	        }
	    }
	    
	}
}


// In an unordered array with duplicates find the second maximum element
public class Main
{
	public static void main(String[] args) {
        
        int[] arr = {5,3,8,1,4,8,3,9,0,2,4};
        
        int max = Integer.MIN_VALUE;
        
        int secmax = max;
        
        for(int i  = 0 ; i<arr.length ; i++ ){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
        }
        
        System.out.println(secmax);
        
        
	}
}


// To find the duplicates elements in an array

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        Map<Integer,Integer> map = new  HashMap<>();
        
        int[] arr = {1,2,2,3,4,4,5,5,4,8,4,7,7,9,0,11,5};
        
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key)>1){
                System.out.println(key+" repeats : "+map.get(key)+" times");
            }
        }
        
	}
}

// For a given array even array add each pairs and print the pairs if equal to a input number

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
       
       int target = 16;
       
       for(int i = 0 ; i<arr.length-1; i++){
           for(int j = i + 1 ; j<arr.length ; j++ ){
               if(arr[i]+arr[j]==target){
                   System.out.println("Pairs : ["+arr[i]+","+arr[j]+"]");
                   return;
               }
           }
       }
        
	}
}


/*
Pattern

1
22
333
4444
55555

*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        int n = 5;
    
       for(int i = 1 ; i<=n ; i++){
           for(int j = 0; j<i ; j++){
               System.out.print(i);
           }
           System.out.println();
       }
        
	}
}


/*
Input - We ate Apple
output - eW eta elppA

don't use split function

*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        String str = "We ate Apple";
        
        char[] arr = str.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : arr){
            if(c==' '){
                System.out.print(sb.toString()+' ');
                sb = new StringBuilder();
            }else{
                sb.insert(0,c);
            } 
        }
        System.out.print(sb.toString());
	}
}


/*
    reverse the string without using inbuilt function
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        String str = "We ate Apple";
        
        char[] arr = str.toCharArray();
        
        for(int i = arr.length-1 ; i >= 0 ; i--){
            System.out.print(arr[i]);
        }
	}
}

// -  For a given array even array add each pairs and place it in new array
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		int[] sumArr = new int[arr.length/2];
		
		int index = 0;
		
		for(int i = 1 ; i<arr.length;i+=2){
		    sumArr[index++] = arr[i-1] + arr[i];
		}
		
		for(int num : sumArr){
		    System.out.print(num+" ");
		}
		
	}
}


/*
    2.Given two arrays , print the common elements only one once
    N={1,2,3,4}
    N2={1,3,2,4,1,3,5,6}
*/

import java.util.*;

public class Main
{
    public static void addNumbersFromArrayToSet(int[] arr,Set<Integer> set){
        for(int num : arr){
            set.add(num);
        }
    }
    
	public static void main(String[] args) {
	    int[] arr1 = {1,2,3,4};
	    
	    int[] arr2 = {1,3,4,1,3,5,6};
	    
	    Set<Integer> set1 = new HashSet<>() , set2 = new HashSet<>();
	    
	    addNumbersFromArrayToSet(arr1,set1);
	    
	    addNumbersFromArrayToSet(arr2,set2);
	    
	    Set<Integer> longestSet, smallestSet;
	    
	    if(set1.size()>set2.size()){
	        longestSet = set1;
	        smallestSet = set2;
	    }else{
	        longestSet = set2;
	        smallestSet = set1;
	    }
	    
	    
	    for(int i : smallestSet){
	        if(longestSet.contains(i)){
	            System.out.print(i+" ");
	        }
	    }
	    
	}
}

