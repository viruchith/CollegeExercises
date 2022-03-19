public class Day05 {

    public static int gcd(int a,int b){
        while(a!=b)
    {
        if(a > b)
            a -= b;
        else
            b -= a;
    }
    return a;
    }
    
	public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
	    int sum = 0;
	    for(int i = 1 ; i<= n ; i++){
	        for(int j = i+1 ; j<=n ; j++){
	            sum+=gcd(i,j);
	        }
	    }
	
	    System.out.println(sum);
	}

}
