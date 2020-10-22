import java.util.*;

class HashTableImplementation{

Scanner sc = new  Scanner(System.in);

private  Hashtable<String, String> ht = new Hashtable<String, String>();

protected void display(){
    
    if(ht.isEmpty()){
        System.out.println("The HashTable is Empty !");
    }else{
        System.out.println("The HashTable : "+ht);
    }
}

protected void insert(){
        
        System.out.print("Enter key to be inserted :  ");
        String key = sc.nextLine() ;
        System.out.print("\n") ;
        
        System.out.print("Enter value to be inserted :  ");
        String value = sc.nextLine() ;
        System.out.print("\n") ;
        
        ht.put(key,value);
        display();
        
}


protected void search(){
        if(!ht.isEmpty()){
            
            System.out.print("Enter key to be searched :  ");
            String key = sc.nextLine() ;
            System.out.print("\n") ;
            
            if(ht.containsKey(key)){
                System.out.println("The value of '"+key+"' is '"+ht.get(key)+"'");
            }else{
                System.out.println("The key was not found in the HashTable !");
            }
            
        }else{
            System.out.println("The HashTable is Empty !");
 
        }
        
}

protected void delete(){
        
       if (!ht.isEmpty()){ 
            System.out.print("Enter key to be deleted :  ");
            String key = sc.nextLine() ;
            System.out.print("\n") ;
            
            if (ht.containsKey(key)){
                ht.remove(key);
                display();
            }else{
                System.out.println("The HashTable does not contain the key ! '"+key+"'");
            } 
           
       }else{

            System.out.println("The HashTable is Empty !");
       
       }
        
       
}

    
}
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    HashTableImplementation hti = new HashTableImplementation();
	    
	    boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        hti.display();
		        break;
		        
		        case 2:
		        hti.insert();
		        break;
		        
		        case 3:
		        hti.delete();
		        break;
		        
		        case 4:
		        hti.search();
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
