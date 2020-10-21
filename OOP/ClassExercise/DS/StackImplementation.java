import java.util.*; 
class StackImplementation{

Scanner sc = new Scanner(System.in);

private Stack <String> stack = new Stack <String>();

private int MaxSize = 0;  

StackImplementation(int MaxSize){
    this.MaxSize = MaxSize ;
    for (int i = 0 ;i<MaxSize ;i++ ){
        System.out.println("Enter String "+(i+1)+" :  ");
        String s = sc.nextLine();
        stack.push(s);
    } 
        System.out.println("Stack Created Successfully \\(^^)/ ");
        display();
    
}


private boolean isEmpty(){
    return stack.empty() ;
}

private boolean isFull(){
    if(MaxSize <= stack.size()){
        return true ;
    }else{
        return false ;
    }
}

protected void peek(){
    if(isEmpty()){
        System.out.println("The stack is empty ! ");
    }else{
        System.out.println("Topmost element : "+stack.peek());
    }
}
    

protected void push(){
    
    if(isFull()){
        System.out.println("The Stack is Full !");
    } else{
        System.out.print("Enter String to be pushed :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        stack.push(s);
        display();
    }
    
}


protected void pop(){
    
    if(isEmpty()){
        System.out.println("The Stack is Empty !");
    } else{
        stack.pop();
        display();
    }
    
}

protected void search(){
    
        System.out.print("Enter String to be searched :  ");
        String s = sc.nextLine() ;
        System.out.print("\n") ;
        int pos = stack.search(s);
        // If the string is not found in the stack
        if(pos == -1){
            System.out.println("The stack does not contain '"+s+"'");            
        }else{
            System.out.println(s+" was found at depth : "+pos);
        }
}


protected void display(){
    if(isEmpty()){
         System.out.println("The Stack is Empty !");

    }else{
    System.out.println("The stack is : "+stack);
        
    }
}

}

public class Main
{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		

        System.out.print("Enter MaxSize of the Stack :  ") ;
        int size = sc.nextInt() ;
        System.out.print("\n") ;
        
        // create the stack initially

		StackImplementation si  = new StackImplementation(size);
        
        boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Push.\n3. Pop.\n4. Search.\n5. Peek.\n6. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        si.display();
		        break;
		        
		        case 2:
		        si.push();
		        break;
		        
		        case 3:
		        si.pop();
		        break;
		        
		        case 4:
		        si.search();
		        break;
		        
                case 5:
		        si.peek();
		        break;
		        
		        case 6:
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

Enter MaxSize of the Stack :  5

Enter String 1 :  
1
Enter String 2 :  
2
Enter String 3 :  
3
Enter String 4 :  
4
Enter String 5 :  
5
Stack Created Successfully \(^^)/ 
[1, 2, 3, 4, 5]

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  3

[1, 2, 3, 4]

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  4

Enter String to be searched :  2

2 was found at depth : 3

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  2

Enter String to be pushed :  10

[1, 2, 3, 4, 10]

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  5

Topmost element : 10

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  1

[1, 2, 3, 4, 10]

==== Options ====
1. Display.
2. Push.
3. Pop.
4. Search.
5. Peek.
6. Exit.

Enter option :  6





*/
