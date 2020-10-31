/*
Write a Java program to display a series of student ID numbers and ask the user to enter a test letter grade for the student. 
Create an Exception class named GradeException that contains a static public array of valid letter grades(‘A’, ‘B’, ‘C’, ‘D’,'E', ‘F’ and ‘I’), 
which you can use to determine whether a grade entered from the application is valid. Create a method named validGrade() which throws a 
GradeException if the user does not enter a valid letter grade. Catch the GradeException, and display the appropriate message.  
If the user enters a valid grade then the corresponding student id and grade are updated in the Hashtable. At the end of the application, 
display all the student IDs and grades which are available in the Hashtable.
*/
import java.io.*;
import java.util.*;

class GradeException extends Exception{
    
    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
    
    public static String grade[] = {"A","B","C","D","E","F","I"};
    
    
    
    void validGrade(int id,String c) throws Exception{
        boolean flag = false ;
        for(String g : grade){
            if(g.equals(c)){
                flag = true ;
                break;
            }
        }
        
        if(flag == false){
            throw new Exception("Grade Exception") ;
        }else{
            ht.put(id,c);
        }
    }
    
    void display(){
        System.out.println(ht);
    }
}

class Student{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        GradeException g = new GradeException();
        int ID[] = new int[5];
        String grd;
        for(int i = 0; i<5;i++){
            ID[i] = i+101 ;
            System.out.print("The Student ID is :"+ID[i]+"\nEnter the grade:");
            grd = in.readLine();
            System.out.println();

            try{
                g.validGrade(ID[i],grd);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Key/Values in Hashtable are:");
        g.display();
        
    }
}
