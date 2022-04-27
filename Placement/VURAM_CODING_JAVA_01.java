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



// find the index of a letter from a given string
public class Main
{
	public static void main(String[] args) {
	    String s = "hello world";
	    
	    char letter = 'w';
	    
	    char[] arr = s.toCharArray();
	    
	    int l = 0 , r = arr.length-1;
	    
	    while(l<r){
	        if(arr[l]==letter){
	            System.out.println(l);
	        }
	        
	        l++;

	        
	        if(arr[r]==letter){
	            System.out.println(r);
	        }
	        r--;
	    }
	}
}


// Print the numbers between 100 and 200 when they have 3 in them
public class Main
{
	public static void main(String[] args) {
	    int start = 100 , end = 200 , target = 3 ;
	    
	    for(int i = start ; i<=end ; i++ ){
	        int temp = i;
	        
	        boolean found = false;
	        
	        while(temp>0){
	            int digit = temp % 10;
	            
	            if(digit == target){
        	         found = true;
        	         break;
	            }
	            
	            temp = temp / 10;
	        }
	        
	        if(found){
	            System.out.println(i);
	        }
	    }
	    
	}
}


// In an unordered array with duplicates find the second maximum element
public class Main
{
	public static void main(String[] args) {
        
        int[] arr = {5,3,8,1,4,8,3,9,0,2,4};
        
        int max = Integer.MIN_VALUE;
        
        int secmax = max;
        
        for(int i  = 0 ; i<arr.length ; i++ ){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
        }
        
        System.out.println(secmax);
        
        
	}
}

