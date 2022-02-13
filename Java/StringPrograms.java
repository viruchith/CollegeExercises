/*
* Questions From https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#axzz7Kk87NQlP
*
*/

// How to Print duplicate characters
from String?

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "hello world";
		
		HashSet<String> set = new HashSet<>();
		
		HashSet<String> duplicates = new HashSet<>();
		
		for(String c : s.split("")){
		    if(set.contains(c)){
		        duplicates.add(c);
		    }
		    
		    set.add(c);
		}
		
		System.out.println("Duplicate Characters : "+duplicates);
	}
}
