/*
Ahmed is a English professor in XYZ college of technology. The college management assigned him a new task. He has to convert a string to camel case i.e capitalise the first letter of each word. Help him to convert the string to camel case .

Input Format

First and only line of input contains a string.

Output Format

Print the string in camel case

Constraints

The First letter of each word in the string should contain only alphabets

Sample Input

rohit is a cricket player

Sample Output

Rohit Is A Cricket Player

Sample Input

develop a code to print the binary value of the input decimal number. Input should be accepted from the command line.

Sample Output

Develop A Code To Print The Binary Value Of The Input Decimal Number. Input Should Be Accepted From The Command Line.

*/
import java.util.Scanner;

class Main
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    
    String s = sc.nextLine();
    String[] arr = s.split(" ");
    
    String result="";
    
    for(String i: arr){
       result += i.substring(0, 1).toUpperCase() + i.substring(1)+" ";
    }
    
    System.out.println(result);

  }
}
