/*

Hollow Square


*  *  *  *  *  
*           *  
*           *  
*           *  
*  *  *  *  *  

*/
public class Main
{
	public static void main(String[] args) {
		int  n = 5;
		
		for (int i = 0;i<n ;i++ ){
		    for (int j=0;j<n ;j++ ){
		        if(i==0 || i==n-1 || j==0 || j==n-1){
		            System.out.print("* ");
		        }else{
		            System.out.print("  ");// 2 <space>
		        }
		    }
		    System.out.println();
		} 
		
	}
}

//------------------------------------------------------------------------------------------------------------------

/*

Hollow Square Pattern with Diagonal in java

* * * * * * * * * * 
* *             * * 
*   *         *   * 
*     *     *     * 
*       * *       * 
*       * *       * 
*     *     *     * 
*   *         *   * 
* *             * * 
* * * * * * * * * * 


*/



public class Main
{
	public static void main(String[] args) {
		int  n = 10;
		
		for (int i = 0;i<n ;i++ ){
		    for (int j=0;j<n ;j++ ){
		        if(i==0 || i==n-1 || j==0 || j==n-1 || j==i || j==n-i-1){
		            System.out.print("* ");
		        }else{
		            System.out.print("  ");// 2 <space>
		        }
		    }
		    System.out.println();
		} 
		
	}
}

//------------------------------------------------------------------------------------------------------------------


/*

Rhombus Star Pattern in java

          * * * * * * * * * 
         * * * * * * * * * 
        * * * * * * * * * 
       * * * * * * * * * 
      * * * * * * * * * 
     * * * * * * * * * 
    * * * * * * * * * 
   * * * * * * * * * 
  * * * * * * * * * 
 * * * * * * * * * 


*/


public class Main
{
	public static void main(String[] args) {
		int  n = 10;
		
		for (int i = 0;i<n ;i++ ){
		    for (int j=0;j<n-i ;j++ ){
		        System.out.print(" ");
		    }
		    
		    for (int k = 0 ; k<n-1 ;k++ ){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		} 
		
	}
}


//------------------------------------------------------------------------------------------------------------------


/*

Right Angled Triangle Star Pattern in java


* 
* * 
* * * 
* * * * 


*/


public class Main
{
	public static void main(String[] args) {
		int  n = 5;
		
		for (int i = 0;i<n ;i++ ){
		    for (int j=0;j<i ;j++ ){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		} 
		
	}
}


//------------------------------------------------------------------------------------------------------------------


/*

Hollow Mirrored Right Angled Triangle Star Pattern in java


           *        
         * *      
       *   *    
     *     *  
   * * * * *



*/



public class Main
{
	public static void main(String[] args) {
		int  n = 5;
		
		for (int i = 0;i<n ;i++ ){
		    for (int j=i;j<n ;j++ ){
		        System.out.print("  ");
		    }
		    
		    for(int k=0;k<n;k++){
		        if(k==0 || i ==k || i==n-1){
		            System.out.print(" *");
		        }else{
		            System.out.print("  ");
		        }
		    }
		    
		    
		    System.out.println();
		} 
		
	}
}

//------------------------------------------------------------------------------------------------------------------

