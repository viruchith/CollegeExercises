import java.util.*; 

class ListImplementation{

    Scanner sc = new Scanner(System.in);
     
    private ArrayList<String> arr = new ArrayList<String>();

    private int max_length = 0;
    
    private boolean isEmpty(){
        if( this.arr.size() <= 0 ){
            
            return true;
            
        }else{
            
            return false;
        
        }
    }
    
    
    private boolean isFull(){
       
        if( this.max_length == arr.size() ){
            return true;
        }else{
            return false;
        }
    
        
    }
    
    protected void search(){
        
        System.out.print("Enter String to be searched :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        if(this.arr.contains(s) ){
            System.out.println(s+" was found at position "+(this.arr.indexOf(s)+1));
        }else{
            System.out.println(s+" was not found int the List ! ");
        }
    }
    
    protected void create(int max_length){
        
        this.max_length = max_length ;
        
        for(int i = 0 ; i <max_length ; i++){
            
            System.out.println("Enter element "+(i+1)+" :  ");
            String s = sc.nextLine();
            this.arr.add(s);
        
        }
        
        System.out.println("List Created Successfully \\(^^)/ ");
        display();
        
            
    }
    
    

    protected void insert(){
        
        if(!isFull()){
            
            System.out.print("Enter the insertion Position :  ");
            int pos = sc.nextInt() ;
            System.out.print("\n") ;
            
            if(pos <= max_length ){
                System.out.print("Enter String to be added :  ");
                String s = sc.nextLine() ;
                s = sc.nextLine() ;
                System.out.print("\n") ;
                
                this.arr.add(pos-1,s);
            
            }else{
            
            System.out.println("Index Out of Range ! ");
            
            }
        }else{
            
            System.out.println("The List is Full ! ");

        }
    }

    protected void delete(){
        
        System.out.print("Enter position of item to be removed :  ");
        int pos = sc.nextInt() ;
        System.out.print("\n");
        
        if(!isEmpty()){
            if(pos<=max_length){
             
             this.arr.remove(pos-1);
             display();
            
                
            }else{
                 System.out.println(" Index Out of range ! ");
            }

        } else{
        
        System.out.println("The List is empty ! ");
 
        }
    }
    
    protected void display(){
        System.out.println("List is : "+this.arr );
    }
    
}


class ArrayListImplementation { 
    
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
		
		ListImplementation li  = new ListImplementation();
		

        System.out.print("Enter size of the List :  ") ;
        int max_length = sc.nextInt() ;
        System.out.print("\n") ;
        
        // create the array initially

        li.create(max_length);
        
        boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Insert.\n3. Delete.\n4. Search.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        li.display();
		        break;
		        
		        case 2:
		        li.insert();
		        break;
		        
		        case 3:
		        li.delete();
		        break;
		        
		        case 4:
		        li.search();
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
/*

Output : 


Enter size of the List :  5

Enter element 1 :  
1
Enter element 2 :  
2
Enter element 3 :  
3
Enter element 4 :  
4
Enter element 5 :  
5
List Created Successfully \(^^)/ 
List is : [1, 2, 3, 4, 5]

==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  5 6

Invalid Option, Try again !

==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  3

Enter position of item to be removed :  2

List is : [1, 3, 4, 5]

==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  2

Enter the insertion Position :  2

Enter String to be added :  2


==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  1

List is : [1, 2, 3, 4, 5]

==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  4

Enter String to be searched :  3

3 was found at position 3

==== Options ====
1. Display.
2. Insert.
3. Delete.
4. Search.
5. Exit.

Enter option :  5





*/

