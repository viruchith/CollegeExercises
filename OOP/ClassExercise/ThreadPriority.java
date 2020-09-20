/*
Write a complex program to illustrate about thread priorities. 
Imagine that the first thread has just begun to run, even before it has a chance to do anything. 
Now the higher priority thread that wants to run as well. 
Now the higher priority thread has to do its work before the first thread starts
*/
class Factorial extends Thread{
    private int n =0,fact=1;
    
    Factorial(int n){
        this.n = n;
    }
    public void run(){  
        
            calculate();
        
    }

    protected void calculate(){
        for(int i=1;i<=n;i++){
             fact = fact * i;
         }  
         
         System.out.println("Factorial : "+fact);
    }
    

    
}

class Sum extends Thread {
    
    private int n=0,sum = 0;
    
    Sum(int n){
        this.n = n;
    }
    public void run(){
            calculate();

    }
    
    protected void calculate(){
        for(int i =0 ; i<=n;i++){
            sum+=i;
        }
         System.out.println("Sum : "+sum);

    }
    
    
    
}
public class ThreadPriority
{
	public static void main(String[] args) {
	    Factorial fact = new Factorial(15);
	    Sum sum = new Sum(10);
	    
	    fact.setPriority(5);
	    sum.setPriority(1);
	    
	    fact.start();
	    sum.start();
	    
	}
}

/*
Output ( when fact is set higher priority than sum ) : 

Factorial : 2004310016                                                                                                  
Sum : 55  

*/

/*
Output ( when both have same priority ) : 

Sum : 55                                                                                                                
Factorial : 2004310016     
*/
