import java.util.* ;

public class HashMapMethods
{
    static void println(Object o){
        System.out.println(o);
    }
    
	public static void main(String[] args) {
	
	HashMap<String,String> hm = new HashMap<String,String>();
	
	hm.put("1","One");
	hm.put("2","Two");
	hm.put("3","Three");
	hm.put("4","Six");
	hm.put("5","Five");
	
	println("HashMap : "+hm);
	println("Size : "+hm.size());
	
	println("Contains Key ('1') : "+hm.containsKey("1"));
	println("Contains Value ('Two') : "+hm.containsValue("Two"));
	
	println("Get ('3') : "+hm.get("3"));
	
	println("Replace ('4','Four') : "+hm.replace("4","Four"));
	println("HashMap : "+hm);
	
	hm.putIfAbsent("0","Zero");
	
	println("Put If Absent ('0','Zero') : "+hm);
	
    Object hm_clone = hm.clone();
    
    println("Clone : "+hm_clone);
    
	}
}

/*

Output : 

HashMap : {1=One, 2=Two, 3=Three, 4=Six, 5=Five}
Size : 5
Contains Key ('1') : true
Contains Value ('Two') : true
Get ('3') : Three
Replace ('4','Four') : Six
HashMap : {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
Put If Absent ('0','Zero') : {0=Zero, 1=One, 2=Two, 3=Three, 4=Four, 5=Five}
Clone : {0=Zero, 1=One, 2=Two, 3=Three, 4=Four, 5=Five}




*/
