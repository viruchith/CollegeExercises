// Program to read Strings using ReadLine()

import java.io.*;

public class ReadLine
{
        public static void main(String[] args) {
            
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           try {
              
            System.out.print("Enter a String : ");
            String input = br.readLine();
            System.out.println("Input : "+input);
               
           } catch(IOException e) {
           
               
           }
            
            
        }
}

