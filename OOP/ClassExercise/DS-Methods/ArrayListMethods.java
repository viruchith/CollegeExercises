import java.util.* ;

public class Main
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("One");
	al.add("Too");
	al.add("Three");
	al.add("Four");
	al.add("Five");
	
	println("ArrayList : "+al);
	
	println("Size : "+al.size());

    al.add(5,"Six");	
	println("Add at position (5,'Six') : "+al);
	
	println("Contains ('One') : "+al.contains("One"));

    println("Is Empty : "+al.isEmpty());
    
    println("Index Of 3 : "+al.indexOf("Three"));
    
    println("Set 'Too' to 'Two' : "+al.set(1,"Two"));
    
    println("ArrayList : "+al);
    
    println("Iterator values : ");
    
    Iterator<String> it = al.iterator();
    
    while(it.hasNext()){
        println(it.next());
    }

    al.clear();
    
	println("Clear List  : "+al);
	

	}
}

/*

Output : 

ArrayList : [One, Too, Three, Four, Five]
Size : 5
Add at position (5,'Six') : [One, Too, Three, Four, Five, Six]
Contains ('One') : true
Is Empty : false
Index Of 3 : 2
Set 'Too' to 'Two' : Too
ArrayList : [One, Two, Three, Four, Five, Six]
Iterator values : 
One
Two
Three
Four
Five
Six
Clear List  : []




*/
