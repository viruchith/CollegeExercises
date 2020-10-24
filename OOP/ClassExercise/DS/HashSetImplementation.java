import java.util.*;

class HashSetImplementation{
    
    Scanner sc = new Scanner(System.in);
    
    private HashSet<String> lhs = new HashSet<String>();
    
    protected void display(){
        if(lhs.isEmpty()){
            System.out.println("The HashSet is Empty !");
        }else{
            System.out.println("HashSet : "+lhs);
        }
    }
    
    protected void insert(){
        System.out.print("Enter String to be inserted :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        lhs.add(s);
    }
    
    protected void search(){
        System.out.print("Enter String to be searched :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        if(lhs.contains(s)){
            System.out.println("The HashSet contains '"+s+"'");
            
        }else{
            System.out.println("The HashSet does not contain '"+s+"'");
        }
    }
    
    
    protected void delete(){
        
        System.out.print("Enter String to be deleted :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        if(lhs.contains(s)){
            lhs.remove(s);
        }else{
            System.out.println("The HashSet does not contain '"+s+"'");
        }
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSetImplementation hsi = new HashSetImplementation();
        
        boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        hsi.display();
		        break;
		        
		        case 2:
		        hsi.insert();
		        break;
		        
		        case 3:
		        hsi.delete();
		        break;
		        
		        case 4:
		        hsi.search();
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
