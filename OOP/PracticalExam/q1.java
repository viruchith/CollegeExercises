/*

Question : 

i. Nolan has been provided with two strings a and b. His task is to change string a such that all the common letters of a and b is to be deleted and the uncommon letters of a and b is to be joined. Help him finish it.

Note: If no changed is possible display -1.

Input Format

The first line of input consists of a string a. The next line consists of a string b.

Output Format

Display the required output.

Constraints

1 <= |Length of Strings| <= 104

Sample Input

aacdb

gafd

Sample Output

cbgf

Sample Input

abcs

cxzca

Sample Output

bsxz

Sample Input

zryzsguaxdqnsqovilnmnntvselkkktqgimcwyydbcdiqduzrfhrudosqgxejyeuktqlcuijlzrppzusqyvcpkwypwmlpemtdvcu

szzyfzchsjxsrjaiccqdjltnllidsxyyifojwqhzepbpkoazzvftncmvremwalijjrdsffevmaeyxdgpsjppvaysikknfxkvkchb

Sample Output

uuuuuuu


Answer:
*/
import java.util.Scanner;

class StringEditor{
    
    private StringBuilder a;
    private StringBuilder b;
    

    StringEditor(String a, String b){
        this.a = new StringBuilder(a);
        this.b = new StringBuilder(b);
    }
    
    private void deleteChar(char c,StringBuilder s){
        boolean elementFound = false;
        for(int i=0;i<s.length();i++){
                if(c==s.charAt(i)){
                    elementFound = true;
                    s.deleteCharAt(i);
                }
        }
        
        if(elementFound==true){
            //recursive to remove duplicate
            deleteChar(c,s);
        }
    }
    
    private void removeSimilar(){
        for(int i=0;i<this.a.length();i++){
            for(int j=0;j<this.b.length();j++){
                if(this.a.charAt(i)==this.b.charAt(j)){
                   // if present in both the strings, delete in both strings
                   this.deleteChar(this.a.charAt(i),this.a);
                    this.deleteChar(this.b.charAt(j),this.b);
                }
        }
        }
    }
    
    public String getString(){
        removeSimilar();
        String merged = this.a.toString()+this.b.toString();
        return merged;
    }
    
    
}

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();

        StringEditor se = new StringEditor(a,b);
        //StringEditor se = new StringEditor("aacdb","gafd");
        System.out.println(se.getString());
    }
}
