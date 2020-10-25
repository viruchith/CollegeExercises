import java.util.* ;

public class HashTableMethods
{
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		ht.put("1","One");
		ht.put("2","Two");
		ht.put("3","Three");
		ht.put("4","Four");
		ht.put("5","Five");
		
		System.out.println("contains 'Two'  : "+ht.contains("Two"));
		System.out.println("contains Key '3'  : "+ht.containsKey("3"));
		System.out.println("contains Value 'four'  : "+ht.containsValue("Four"));
		
		System.out.println("HashCode : "+ht.hashCode());
		System.out.println("Is Empty ? : "+ht.isEmpty());
		
		System.out.println("Size : "+ht.size());
		
		
		
		System.out.println("Keys : "+ht.keySet().toString());
		System.out.println("Values : "+ht.values());
		
		System.out.println("Contains 5 ? : "+ht.contains(5));

        System.out.println("Remove 5 : "+ht.remove("5"));
        
        System.out.println("After removing 5 : "+ht);
		
		
		
		
		
		
	}
}

/*
Output :

contains 'Two'  : true
contains Key '3'  : true
contains Value 'four'  : true
HashCode : 85336635
Is Empty ? : false
Size : 5
Keys : [5, 4, 3, 2, 1]
Values : [Five, Four, Three, Two, One]
Contains 5 ? : false
Remove 5 : Five
After removing 5 : {4=Four, 3=Three, 2=Two, 1=One}




*/
