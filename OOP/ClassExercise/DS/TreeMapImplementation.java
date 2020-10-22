import java.util.*;

class TreeMapImplementation{

Scanner sc = new  Scanner(System.in);

private TreeMap<String,String> tm = new TreeMap<String,String>();

protected void display(){
    if(tm.isEmpty()){
        System.out.println("The PriorityQueue is Empty !");
    }else{
        System.out.println("The PriorityQueue is : "+tm);
    }
    
}

protected void insert(){
    
        System.out.print("Enter key to be inserted :  ");
        String key = sc.nextLine() ;
        System.out.print("\n") ;
        
        System.out.print("Enter value to be inserted :  ");
        String value = sc.nextLine() ;
        System.out.print("\n") ;
        
        tm.put(key,value); 
    
}     

protected void delete(){
    
    if(tm.isEmpty()){
       System.out.println("The TreeMap is Empty ! "); 
    }else{
        System.out.print("Enter key to be deleted :  ");
        String key = sc.nextLine() ;
        System.out.print("\n") ;
        
        if (tm.containsKey(key)){
            tm.remove(key);
            display();
        } else{
            System.out.println("The key was not found in the TreeMap ! ");
        }
    }
}

protected void search(){
    
    if(tm.isEmpty()){
        System.out.println("The TreeMap is Empty ! ");
    }else{
        System.out.print("Enter key to be searched :  ");
        String key = sc.nextLine() ;
        System.out.print("\n") ;
        
         if(tm.containsKey(key)){
             System.out.println("The value of '"+key+"' is '"+tm.get(key)+"' ");
         }else{
             System.out.println("The key was not found in the TreeMap ! ");          
         }  
    }

    
}

    
}

class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        TreeMapImplementation tmi = new TreeMapImplementation();
    
        boolean flag = true ;
        
		    while( flag == true ){
		
		    System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        tmi.display();
		        break;
		        
		        case 2:
		        tmi.insert();
		        break;
		        
		        case 3:
		        tmi.delete();
		        break;
		        
		        case 4:
		        tmi.search();
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
