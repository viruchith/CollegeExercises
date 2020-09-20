/*
Write a java program that prints numbers from 1 to 10 line by line after every 5 seconds. 

*/
class ThreadDemo extends Thread{
    
    public void run(){  
       try{
           
       for (int i = 1;i<=10 ;i++ ){
            System.out.println(i);
            Thread.sleep(5000);
        } 
        
       }catch(InterruptedException ie){
           
       }
}  

    
}

public class ThreadSleep
{
	public static void main(String[] args) {
	    
	    ThreadDemo td = new ThreadDemo();
	    td.start();
	    
	}
}

/*
Output : 

1
2
3
4
5
6                                                                                                                       
7                                                                                                                       
8                                                                                                                       
9                                                                                                                       
10                                                                                                                      
                                                                                                                        

*/
