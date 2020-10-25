import java.util.* ;

public class PriorityQueueMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
    PriorityQueue<String> pq = new PriorityQueue<String>();	
    pq.add("One");
    pq.add("Two");
    pq.add("Three");
    pq.add("Four");
    pq.add("Five");
    
    println("PriorityQueue : "+pq);
    println("HashCode : "+pq.hashCode());
    
    println("Size : "+pq.size());
    println("Is Empty ? : "+pq.isEmpty());
    
    println("Peek : "+pq.peek());
    
    println("Contains ('One') : "+pq.contains("One"));
    
    println("Remove ('Three') : "+pq.remove("Three"));
    println("PriorityQueue : "+pq);
    
    println("Offer ('Six') : "+pq.offer("Six"));
    
    println("PriorityQueue : "+pq);
	
    
	}
}
/*

Output : 

PriorityQueue : [Five, Four, Three, Two, One]
HashCode : 705927765
Size : 5
Is Empty ? : false
Peek : Five
Contains ('One') : true
Remove ('Three') : true
PriorityQueue : [Five, Four, One, Two]
Offer ('Six') : true
PriorityQueue : [Five, Four, One, Two, Six]




*/
