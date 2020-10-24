import java.util.*;
class LinkedHashSetImplementation{
    
    Scanner sc = new Scanner(System.in);
    
    private LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    
    protected void display(){
        if(lhs.isEmpty()){
            System.out.println("The LinkedHashSet is Empty !");
        }else{
            System.out.println("LinkedHashSet : "+lhs);
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
            System.out.println("The LinkedHashSet contains '"+s+"'");
            
        }else{
            System.out.println("The LinkedHashSet does not contain '"+s+"'");
        }
    }
    
    
    protected void delete(){
        
        System.out.print("Enter String to be deleted :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        if(lhs.contains(s)){
            lhs.remove(s);
        }else{
            System.out.println("The LinkedHashSet does not contain '"+s+"'");
        }
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedHashSetImplementation lhsi = new LinkedHashSetImplementation();
        
        boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        lhsi.display();
		        break;
		        
		        case 2:
		        lhsi.insert();
		        break;
		        
		        case 3:
		        lhsi.delete();
		        break;
		        
		        case 4:
		        lhsi.search();
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
