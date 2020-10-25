import java.util.* ;

public class HashSetMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("One");
	hs.add("Two");
	hs.add("Three");
	hs.add("Four");
	hs.add("Five");
	
	println("HashSet : "+hs);
	
	println("Size : "+hs.size());
	
	println("Contains ('Two') : "+hs.contains("Two"));

    println("Is Empty : "+hs.isEmpty());
    
    hs.remove("Five");
    println("Remove ('Five') : "+hs);
    
    println("Iterator values : ");
    
    Iterator<String> it = hs.iterator();
    
    Object cloned = hs.clone();
    
    while(it.hasNext()){
        println(it.next());
    }

    hs.clear();
    
	println("Clear Set  : "+hs);
	
	println("Cloned : "+cloned);

	}
}


/*

Output : 

HashSet : [Five, One, Four, Two, Three]
Size : 5
Contains ('Two') : true
Is Empty : false
Remove ('Five') : [One, Four, Two, Three]
Iterator values : 
One
Four
Two
Three
Clear Set  : []
Cloned : [Two, Three, One, Four]




*/
