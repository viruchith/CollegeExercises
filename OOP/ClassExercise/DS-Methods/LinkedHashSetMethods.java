import java.util.* ;

public class LinkedHashSetMethods
{
	public static void main(String[] args) {
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	lhs.add("One");
	lhs.add("Two");
	lhs.add("Three");
	lhs.add("Four");
	lhs.add("Five");

	System.out.println("The LinkedHashSet : "+lhs);	
	System.out.println("Is Empty ? : "+lhs.isEmpty());	
	System.out.println("Contains 'Two' ? : "+lhs.contains("Two"));	
	System.out.println("HashCode : "+lhs.hashCode());	
	System.out.println("Size : "+lhs.size());	
	System.out.println("Remove 'One' : "+lhs.remove("One"));	
	System.out.println("After removing 'One' : "+lhs);	
	System.out.println("Is Empty ? : "+lhs.isEmpty());	
	System.out.println("To String : "+lhs.toString());
		
		
		
	}
}
/*

Output : 

The LinkedHashSet : [One, Two, Three, Four, Five]
Is Empty ? : false
Contains 'Two' ? : true
HashCode : 85336584
Size : 5
Remove 'One' : true
After removing 'One' : [Two, Three, Four, Five]
Is Empty ? : false
To String : [Two, Three, Four, Five]




*/
