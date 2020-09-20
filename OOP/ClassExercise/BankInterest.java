/*
Consider a scenario to write a Java program where Bank is a class that provides a method to get the rate of interest. 
However, the rate of interest may differ according to banks. 
For example, SBI, ICICI, and AXIS banks are providing 5.2%, 4.3%, and 10.7% rate of interest.
*/
class Bank{
    
    protected void getInterest(){
        System.out.println("Interest");
    }
}

class SBI extends Bank{
    protected void getInterest(){
    System.out.println("SBI : 5.2%");    
    }
}

class ICICI extends Bank{
    protected void getInterest(){
    System.out.println("ICICI : 4.2%");    
    }
}

class AXIS extends Bank{
    
    protected void getInterest(){
    
    System.out.println("AXIS : 10.7%");    
       
    }

    
}

public class BankInterest
{
	public static void main(String[] args) {
	    SBI sb = new SBI();
	    ICICI ic = new ICICI();
	    AXIS ax = new AXIS();
	    
	    sb.getInterest();
	    ic.getInterest();
	    ax.getInterest();
	    
	}
}

/*Output : 

SBI : 5.2%                                                                                                              
ICICI : 4.2%                                                                                                            
AXIS : 10.7%

*/
