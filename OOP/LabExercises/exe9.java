/*
Write a JAVA program that creates threads by extending Thread class . 
Firstthread display "Good Morning " every 1 sec, the second thread displays 
"Hello "every 2 seconds and the third display "Welcome" every 3 seconds.
*/

class ThreadClass extends Thread{
    
    private String msg ;
    private int sleep ;
    
    ThreadClass(String msg,int sleep){
        this.msg = msg ;
        this.sleep = sleep ;
    }
    
    public void run(){
        while(true){

        try {
            Thread.sleep(this.sleep) ;
       } catch(InterruptedException e) {
           
       }
       finally{
        System.out.println(this.msg);
       }    
        }
        
    }
}



public class Main{
    public static void main (String[] args) {
        
        
        ThreadClass t1 = new ThreadClass("Good morining",1000);
        ThreadClass t2 = new ThreadClass("Hello",2000);
        ThreadClass t3 = new ThreadClass("Welcome",3000);
       
        t1.start();
        t2.start();
        t3.start();

    }
}
