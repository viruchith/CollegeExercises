import java.util.* ;

public class LinkedListMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
    LinkedList<String> li = new LinkedList<String>();	
	
    li.add("One");
    li.add("Two");
    li.add("Three");
    li.add("Four");
    li.add("Five");
    
    println("LinkedList : "+li);
    li.addFirst("Zero");
    println("Add First ('Zero') : "+li);
    li.addLast("Six");
    println("Add Last ('Six') : "+li);
    println("LinkedList : "+li);
    println("LinkedList : "+li);
    
    println("Peek First : "+li.peekFirst());
    println("Peek Last : "+li.peekLast());
    
    println("Remove (0) : "+li.remove(0));
    println("LinkedList : "+li);

    println("Remove ('Six') : "+li.remove("Six"));
    println("LinkedList : "+li);
  
    println("Size : "+li.size()); 
	
	println("Offer ('Six') : "+li.offer("Six"));
    println("LinkedList : "+li);
    

	}
}


/*
Output : 

LinkedList : [One, Two, Three, Four, Five]
Add First ('Zero') : [Zero, One, Two, Three, Four, Five]
Add Last ('Six') : [Zero, One, Two, Three, Four, Five, Six]
LinkedList : [Zero, One, Two, Three, Four, Five, Six]
LinkedList : [Zero, One, Two, Three, Four, Five, Six]
Peek First : Zero
Peek Last : Six
Remove (0) : Zero
LinkedList : [One, Two, Three, Four, Five, Six]
Remove ('Six') : true
LinkedList : [One, Two, Three, Four, Five]
Size : 5
Offer ('Six') : true
LinkedList : [One, Two, Three, Four, Five, Six]



*/
