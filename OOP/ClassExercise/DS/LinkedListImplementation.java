import java.util.*; 
 
class LinkedListImplementation{
 
 Scanner sc = new Scanner(System.in);
 
 private LinkedList<String> li = new LinkedList<String>();  
 
 private boolean isEmpty(){
     if(li.size() == 0){
         return true ;
     }else{
         return false ;
     }
 }

protected void head(){
    if(isEmpty()){
        System.out.println("The list is Empty !");
    }else{
        System.out.println("Head : "+li.getFirst());
    }
}

protected void tail(){
    if(isEmpty()){
        System.out.println("The list is Empty !");
    }else{
        System.out.println("Tail : "+li.getLast());
    }
}

protected void insertAtTheBeginning(){
        System.out.print("Enter String to be inserted at the beginning :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        li.addFirst(s);
}

protected void insertAtTheLast(){
        System.out.print("Enter String to be inserted at the last :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        
        li.addLast(s);
}

protected void insertAtNthPosition(){
    
            System.out.print("Enter the insertion Position :  ");
            int pos = sc.nextInt() ;
            System.out.print("\n") ;
            if( pos<=li.size()+1 && pos>0 ){
                System.out.print("Enter String to be inserted :  ");
                String s = sc.nextLine() ;
                s = sc.nextLine() ;
                System.out.print("\n") ;
                li.add(pos-1,s);
            }else{
                System.out.println("Invalid Position !");
            }
}

protected void deleteAtTheBeginning(){
         if(isEmpty()){
            System.out.println("The list is Empty !");
         }else{
            li.removeFirst();
         }
}

protected void deleteAtTheLast(){
         if(isEmpty()){
            System.out.println("The list is Empty !");
         }else{
            li.removeLast();
         }
}

protected void deleteAtNthPosition(){
    
            System.out.print("Enter the Deletion Position :  ");
            int pos = sc.nextInt() ;
            System.out.print("\n") ;
            if( pos<=li.size()){
                li.remove(pos-1);
            }else{
                System.out.println("Invalid Position !");
            }
}

protected void display(){
    if(isEmpty()){
        
        System.out.println("The list is Empty !");
        
    }else{
        System.out.println("The list : "+li);
    }
}

protected void search(){
    
        System.out.print("Enter String to be searched :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
    
    if(isEmpty()){
        
        System.out.println("The list is Empty !");
        
    }else if(li.indexOf(s)==-1){
        
        System.out.println(s+" was not found in the list ! ");
        
    }else{
        
        System.out.println(s+" was found in the list at position : "+li.indexOf(s));

    }
}

}

class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        
        LinkedListImplementation li = new LinkedListImplementation();
        
        boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Head.\n2. Tail.\n3. Insert at the beginning.\n4. Insert at the last.\n5. Insert at Nth position.\n6. Delete at the beginning.\n7. Delete at the last.\n8. Delete at the Nth position.\n9. Display\n10. Search.\n11. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        li.head();
		        break;
		        
		        case 2:
		        li.tail();
		        break;
		        
		        case 3:
		        li.insertAtTheBeginning();
		        break;
		        
		        case 4:
		        li.insertAtTheLast();
		        break;
		        
                case 5:
		        li.insertAtNthPosition();
		        break;
		        
		        case 6:
		        li.deleteAtTheBeginning();
		        break;
		        
		        case 7:
		        li.deleteAtTheLast();
		        break;
		        
		        case 8:
		        li.deleteAtNthPosition();
		        break;
		        
		        case 9:
		        li.display();
		        break;
		        
		        case 10:
		        li.search();
		        break;
		        
		        case 11:
		        flag = false;
		        break;
		      
		        default:
		        System.out.println("Invalid Option, Try again !");
		        break;

		    }
		    
		}

        
    }
}
