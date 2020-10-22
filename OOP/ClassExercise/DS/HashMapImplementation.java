import java.util.*;

class HashMapImplementation{

Scanner sc = new  Scanner(System.in);

private  HashMap<String, String> hm = new HashMap<String, String>();

protected void display(){
    
    if(hm.isEmpty()){
        System.out.println("The HashMap is Empty !");
    }else{
        System.out.println("The HashMap : "+hm);
    }
}

protected void insert(){
        
        System.out.print("Enter key to be inserted :  ");
        String key = sc.nextLine() ;
        System.out.print("\n") ;
        
        System.out.print("Enter value to be inserted :  ");
        String value = sc.nextLine() ;
        System.out.print("\n") ;
        
        hm.put(key,value);
        display();
        
}


protected void search(){
        if(!hm.isEmpty()){
            
            System.out.print("Enter key to be searched :  ");
            String key = sc.nextLine() ;
            System.out.print("\n") ;
            
            if(hm.containsKey(key)){
                System.out.println("The value of '"+key+"' is '"+hm.get(key)+"'");
            }else{
                System.out.println("The key was not found in the HashMap !");
            }
            
        }else{
            System.out.println("The HashMap is Empty !");
 
        }
        
}

protected void delete(){
        
       if (!hm.isEmpty()){ 
            System.out.print("Enter key to be deleted :  ");
            String key = sc.nextLine() ;
            System.out.print("\n") ;
            
            if (hm.containsKey(key)){
                hm.remove(key);
                display();
            }else{
                System.out.println("The HashMap does not contain the key ! '"+key+"'");
            } 
           
       }else{

            System.out.println("The HashMap is Empty !");
       
       }
        
       
}

    
}
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    HashMapImplementation hmi = new HashMapImplementation();
	    
	    boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        hmi.display();
		        break;
		        
		        case 2:
		        hmi.insert();
		        break;
		        
		        case 3:
		        hmi.delete();
		        break;
		        
		        case 4:
		        hmi.search();
		        break;
		        
		        case 5:
		        flag = false;
		        break;
		        
		        default:
		        System.out.println("Invalid Option, Try again !");
		        break;

		    }
		    
		}

	}
}
