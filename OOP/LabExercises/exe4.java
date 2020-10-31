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
