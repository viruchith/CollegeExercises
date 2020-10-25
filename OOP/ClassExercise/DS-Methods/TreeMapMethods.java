import java.util.* ;

public class TreeMapMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
	TreeMap<String,String> tm = new TreeMap<String,String>();
	
	tm.put("1","One");
	tm.put("2","Two");
	tm.put("3","Three");
	tm.put("4","Four");
	tm.put("5","Five");
	
	println("TreeMap : "+tm);
	println("Size : "+tm.size());
	
	println("Ceiling Key ('0') : "+tm.ceilingKey("0"));
	println("Ceiling Entry('0') : "+tm.ceilingEntry("0"));
	
	println("First Entry : "+tm.firstEntry());
	println("Last Entry : "+tm.lastEntry());
	
	println("HashCode : "+tm.hashCode());
	
	println("FirstKey : "+tm.firstKey());
	println("LasttKey : "+tm.lastKey());
	
	println("Contains Key ('1') : "+tm.containsKey("1"));
	println("Contains Value ('One') : "+tm.containsValue("One"));
	
	}
}
/*

Output : 

TreeMap : {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
Size : 5
Ceiling Key ('0') : 1
Ceiling Entry('0') : 1=One
First Entry : 1=One
Last Entry : 5=Five
HashCode : 85336635
FirstKey : 1
LasttKey : 5
Contains Key ('1') : true
Contains Value ('One') : true





*/
