import java.util.*;

class PriorityQueueImplementation{

Scanner sc = new  Scanner(System.in);

private PriorityQueue<String> pq = new PriorityQueue<String>();;

protected void display(){
    if(pq.isEmpty()){
        System.out.println("The PriorityQueue is Empty !");
    }else{
        System.out.println("The PriorityQueue is : "+pq);
    }
    
}

protected void enqueue(){
        
        System.out.print("Enter value to be enqueued :  ");
        String value = sc.nextLine() ;
        System.out.print("\n") ;
        
        pq.add(value);
}


protected void dequeue(){
    if(pq.isEmpty()){
        System.out.println("The PriorityQueue is Empty !");
    }else{
        pq.poll();
    }
        
}


protected void peek(){
    
  if(pq.isEmpty()){
        System.out.println("The PriorityQueue is Empty !");
    }else{
        System.out.println("Top Element : "+pq.peek());
    }  
       
}

    
}
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    PriorityQueueImplementation pqi = new PriorityQueueImplementation();
	    
	    boolean flag = true ;
        
		while( flag == true ){
		
		System.out.println("\n==== Options ====\n1. Display.\n2. Enqueue.\n3. Dequeue.\n4. Peek.\n5. Exit.\n");

        System.out.print("Enter option :  ");
        
        int opt = sc.nextInt() ;
        
        System.out.print("\n") ;
		   
		    switch( opt ){
		        
		        case 1:
		        pqi.display();
		        break;
		        
		        case 2:
		        pqi.enqueue();
		        break;
		        
		        case 3:
		        pqi.dequeue();
		        break;
		        
		        case 4:
		        pqi.peek();
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


==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  1

The PriorityQueue is Empty !

==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  2

Enter value to be enqueued :  1


==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  2

Enter value to be enqueued :  2


==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  1

The PriorityQueue is : [1, 2]

==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  2

Enter value to be enqueued :  3


==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  4

Top Element : 1

==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  3


==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  1

The PriorityQueue is : [2, 3]

==== Options ====
1. Display.
2. Enqueue.
3. Dequeue.
4. Peek.
5. Exit.

Enter option :  5





*/
