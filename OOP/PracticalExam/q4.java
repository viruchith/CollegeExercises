/*

A team is participating in a competition in which one member has to say a string other one has to say a substring from it and the third one has to say the string that has to replace the substring and the last person has to say the modified string. Write a program to obtain a string, substring, and the string that has to replace the substring and prints the modified string.

Input Format
The first line of the input consists of a string.

The second line of the input consists of a substring.

The third line of the input consists of a string that has to replace the substring.

Output Format
Output prints the modified string.

Sample 1 Input
audacious
cio
aaa
Sample 1 Output
audaaaaus

Sample 2 Input
Miss the boat
the
a
Sample 2 Output
Miss a boat

*/

import java.util.Scanner;

public class Main
{
    private static void modifyString(String s, String subs_str, String replace_str){
        int start = 0, stop = 0;
        
        System.out.println(s.replace(subs_str,replace_str));
        
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    String subs_str = sc.nextLine();
	    String replace_str = sc.nextLine();
        
        modifyString(s,subs_str,replace_str);
	    
	}
}
