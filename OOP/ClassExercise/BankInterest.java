/*
Consider a scenario to write a Java program where Bank is a class that provides a method to get the rate of interest. 
However, the rate of interest may differ according to banks. 
For example, SBI, ICICI, and AXIS banks are providing 5.2%, 4.3%, and 10.7% rate of interest.
*/
class Bank{
    protected double r = 0;
    protected void setRate(double r){
        this.r = r;
    }
    protected double getInterest(double p,int n){
        return ((p*n*this.r)/100) ;
    }
}

class SBI extends Bank{
}

class ICICI extends Bank{
}

class AXIS extends Bank{

    
}

public class Main
{
	public static void main(String[] args) {
	    SBI sb = new SBI();
	    ICICI ic = new ICICI();
	    AXIS ax = new AXIS();
	    
	    sb.setRate(5.2);
	    System.out.println("SBI : Rs."+sb.getInterest(10000,12));
	    ic.setRate(4.3);
	    System.out.println("ICICI : Rs."+ic.getInterest(10000,12));
	    ax.setRate(10.7);
	    System.out.println("Axis : Rs."+ax.getInterest(10000,12));
	}
}

/*Output : 

SBI : Rs.6240.0                                                                                                         
ICICI : Rs.5160.0                                                                                                       
Axis : Rs.12840.0 

*/
