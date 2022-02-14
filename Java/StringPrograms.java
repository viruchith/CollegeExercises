/*
* Questions From https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#axzz7Kk87NQlP
*
*/

// How to Print duplicate characters from String?

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


//--------------------------------------------------------------------------------------------------------
// How to check if two Strings are anagrams of each other?

	
import java.util.*;

public class Main
{
    
    public static boolean isAnagramStringBuilder(String word,String anagram){
        
        if(word.length()!=anagram.length()){
            return false;
        }
		
		StringBuilder sb = new StringBuilder(anagram);
		
		for(String letter : word.split("")){
		    int index = sb.indexOf(letter);
		    if(index==-1){
		        break;
		    }
		    sb.deleteCharAt(index);
		}
		
		return sb.length()==0;
    }
    
    public static boolean isAnagramHashMap(String word,String anagram){
        if(word.length()!=anagram.length()){
            return false;
        }
        
        Map<Character,Integer> wordMap = new HashMap<>() , anagramMap = new HashMap<>();
        
        for(int i = 0 ; i<word.length() ; i++){
            Character wordLetter = word.charAt(i) , anagramLetter = anagram.charAt(i);
            
            if(wordMap.containsKey(wordLetter)){
                wordMap.put(wordLetter,wordMap.get(wordLetter)+1);
            }else{
                wordMap.put(wordLetter,1);
            }
            
            if(anagramMap.containsKey(anagramLetter)){
                anagramMap.put(anagramLetter,wordMap.get(anagramLetter)+1);
            }else{
                anagramMap.put(anagramLetter,1);
            }
        }
        
        return wordMap.equals(anagramMap);
    }
    
	public static void main(String[] args) {
		String word1 = "mary" , anagram1 = "army";
		String word2 ="hello" , anagram2 = "elhlo";
		String word3 ="jim" , anagram3 = "jam";
    
        System.out.println(isAnagramHashMap(word1,anagram1));
        System.out.println(isAnagramHashMap(word3,anagram3));
        
        System.out.println(isAnagramStringBuilder(word1,anagram1));
        System.out.println(isAnagramStringBuilder(word3,anagram3));


	}
}

//---------------------------------------------------------------------------------------------------------------------
// 3) How to program to print first non repeated character from String?


import java.util.*;

public class Main
{
    
    public static Character firstNonRepeatingCharacter(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(Character letter : word.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter,map.get(letter)+1);
            }else{
                map.put(letter,1);
            }
        }
        
        for(Character letter : word.toCharArray()){
            if(map.get(letter)==1){
                return letter;
            }
        }
        
        return null;
        
    }
    
	public static void main(String[] args) {
		String word = "helleohworld";
		System.out.println(firstNonRepeatingCharacter(word)); // w
	}
}

//-----------------------------------------------------------------------------------------------------------------------
// 4) How to Reverse String in Java Using Iteration and Recursion


	
import java.util.*;

public class Main
{
    
    public static String reverseUsingCharArray(String word){
        char[] letters = word.toCharArray();
        int l = 0 , r = letters.length - 1 ;
        
        while(l<r){
            char temp = letters[l];
            letters[l] = letters[r];
            letters[r] = temp;
            l++;r--;
        }
        
        return new String(letters);
    }
    
    public static String reverseUsingRecursion(String word){
        if(word.equals("")){
            return "";
        }
        return word.substring(word.length()-1) + reverseUsingRecursion(word.substring(0,word.length()-1));
    }
   
	public static void main(String[] args) {
		String word = "hello";
		System.out.println(reverseUsingCharArray(word)); // olleh
		System.out.println(reverseUsingRecursion(word)); // olleh
	}
}

//-------------------------------------------------------------------------------------------------------------
// 5) How to check if a String contains only digits?


import java.util.*;
import java.util.regex.*;

public class Main
{
    
    public static boolean isANumberUsingRegex(String s){
        Pattern pattern = Pattern.compile("\\d*");
        return pattern.matcher(s).matches();
    }
    
    public static boolean isAlphaUsingRegex(String s){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        return pattern.matcher(s).matches();
    }
   
	public static void main(String[] args) {
		String s1 = "123" , s2 = "abc123" , s3 =  "helloworld";
		
		System.out.println(isANumberUsingRegex(s1));
		System.out.println(isAlphaUsingRegex(s3));
		/*
		*Character.isDigit(ch c)
		*Character.isLetterOrDigit(ch c)
		*Character.isLetter(ch c)
		*/
		
	}
}

//-------------------------------------------------------------------------------------------------------
// 7) How to count a number of vowels and consonants in a String?


	
import java.util.*;

public class Main
{
    public static int countVowels(String word){
        int vowelCount = 0;
        
        for(Character c : word.toCharArray()){
            switch(c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowelCount++;
                    break;
                default:
                break;
            }
        }
        
        return vowelCount;
    }
    
	public static void main(String[] args) {
		String  s =  "hellOworld";
		System.out.println("vowels : "+countVowels(s)+" "+"consonants : "+s.length()-countVowels(s));
	}
}
//-----------------------------------------------------------------------------------------------------------

// 8) How to count the occurrence of a given character in String?



import java.util.*;

public class Main
{
    public static int countLetter(String word , char c){
        if(word==null || word.isBlank()){
            return -1;
        }
        
        int count = 0;
        
        for(Character i : word.toCharArray()){
            if(i==c){
                count++;
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) {
	    String s1 = "java" , s2 = "apple" ;
	    System.out.println(countLetter(s1,'a'));
	    System.out.println(countLetter(s2,'l'));
	}
}
//-------------------------------------------------------------------------------------------

//9) How to convert numeric String to an int?

import java.util.*;

public class Main
{
    public static int strToInt(String s){
        int result = 0;
        for(char c : s.toCharArray()){
            result = (result * 10) + (c - '0');
        }
        
        return result;
    }
    
	public static void main(String[] args) {
	    String s1 = "123" , s2 = "a123" ;
	    System.out.println(strToInt(s1));
	    System.out.println(strToInt(s2));
	}
}


//-----------------------------------------------------------------------------------------------------------------------

// 10) How to replace each given character to other e.g. blank with %20? (solution)



import java.util.*;

public class Main
{
    public static String replaceWith(String str,Character replace,String replacement){
        if(str==null || replace==null || replacement==null ){
            return null;
        }
        
        StringBuilder replaced = new StringBuilder();
        
        for(int i = 0 ; i < str.length() ; i++ ){ // also to charArray()
            char c = str.charAt(i);
            if(c==replace){
                replaced.append(replacement);
            }else{
                replaced.append(c);
            }
        }
        
        return replaced.toString();
    }
    
	public static void main(String[] args) {
	    String s1 = "hello world" , s2 = "Java-is-awesome";
	    System.out.println(replaceWith(s1,' ',"%20"));
	    System.out.println(replaceWith(s2,'-'," "));
	}
}


//---------------------------------------------------------------------------------------------------------------------

