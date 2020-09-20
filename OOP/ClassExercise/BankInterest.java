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

public class BankInterest
{
	public static void main(String[] args) {
	    SBI sb = new SBI();
	    ICICI ic = new ICICI();
	    AXIS ax = new AXIS();
	    
	    sb.setRate(5.2);
	    System.out.println("SBI : "+sb.getInterest(10000,12));
	    ic.setRate(4.3);
	    System.out.println("ICICI : "+ic.getInterest(10000,12));
	    ax.setRate(10.7);
	    System.out.println("Axis : "+ax.getInterest(10000,12));
	}
}
