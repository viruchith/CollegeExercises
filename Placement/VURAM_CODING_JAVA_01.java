// Print a prime numbers between 100 and 200 and logic explanation.
public class Main
{
	public static void main(String[] args) {
		int start = 100 , end = 200;
		
		for(int i = start ; i <= end ; i++ ){
		    boolean prime = true;
		    for(int j = 2 ; j < i/2 ;j++ ){
		        if(i%j == 0){
		            prime = false;
		            break;
		        }
		    }
		    
		    if(prime){
		        System.out.println(i);
		    }
		}
	}
}
