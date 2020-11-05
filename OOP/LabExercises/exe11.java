/*

A string is said to be complete if it contains all the characters from a to z. Given a string, check if it complete or not.

Input
First line of the input contains the number of strings N. It is followed by N lines each contains a single string.

Output
For each test case print "YES" if the string is complete, else print "NO"

Constraints
1 <= N <= 10
The length of the string is at max 100 and the string contains only the characters a to z

SAMPLE INPUT
 

3
wyyga
qwertyuioplkjhgfdsazxcvbnm
ejuxggfsts

SAMPLE OUTPUT
 

NO
YES
NO



*/
import java.util.* ;

class OnlyAlpha{
    
    private boolean isAlpha(char[] arr){
        for(char c : arr){
            
            if( ((int)c>=65 && (int)c<=90) || ((int)c>=97 && (int)c<=122) ){

            }else{
                return false ;
            }
            
        }
        return true ;

    }
    
    protected String isValid(String s){
        if (s.length()<=100 && s.length()>0){
            if(isAlpha(s.toCharArray())){
                String lower = s.toLowerCase() ;
                for(char c = 'a' ; c<='z' ; ++c){
                    
                    if(lower.contains(Character.toString(c))){
                        
                    }else{
                      return "NO" ;  
                    }
                }
                return "YES" ;
            }else{
                return "NO" ;
            }
        }else{
            return "NO" ;
        } 
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    OnlyAlpha oa = new OnlyAlpha();
	    
	    System.out.println(oa.isValid(sc.nextLine()));
	    System.out.println(oa.isValid(sc.nextLine()));
	    System.out.println(oa.isValid(sc.nextLine()));
	    System.out.println(oa.isValid(sc.nextLine()));
	    
	    
	}
}
