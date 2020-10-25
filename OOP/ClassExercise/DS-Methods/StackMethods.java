import java.util.* ;

public class StackMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
	Stack<String> st = new Stack<String>();
	
	st.push("One");
	st.push("Two");
	st.push("Three");
	st.push("Four");
	st.push("Five");
	
	println("Stack : "+st);
	println("Push ('Six') : "+st.push("Six"));
	println("Stack : "+st);
	println("Pop : "+st.pop());
 	println("Stack : "+st);
    
    println("Search ('Three') : "+st.search("Three"));  
    
    println("Size : "+st.size());
    
    println("Capacity : "+st.capacity());
    println("HashCode : "+st.hashCode());
    
    println("Index Of 'Two' : "+st.indexOf("Two"));
    
    println("Remove At (0) : "+st.remove(0));
    
    println("Stack : "+st);
    
	}
}

/*

Output :

Stack : [One, Two, Three, Four, Five]
Push ('Six') : Six
Stack : [One, Two, Three, Four, Five, Six]
Pop : Six
Stack : [One, Two, Three, Four, Five]
Search ('Three') : 3
Size : 5
Capacity : 10
HashCode : -1010478461
Index Of 'Two' : 1
Remove At (0) : One
Stack : [Two, Three, Four, Five]



*/
