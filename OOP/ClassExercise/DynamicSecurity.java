/*

Consider a scenario to achieve dynamic binding where Security is a class that provides a method response(). 
However, the response may vary from according to the owner, employees, and clients. 

*/
class Security{
    
    void response(){
        System.out.println("Protecting Assets !");
    }
}

class Owner extends Security {
    
    void response(){
        System.out.println("Owner plans Security guidelines.");
    }
    
}

class Employee extends Security {
    
    void response(){
        System.out.println("Employee follows security guidelines.");
    }
    
}

class Client extends Security {
    
    void response(){
        System.out.println("Client follows Employee's instructions.");
    }
    
}

public class DynamicSecurity
{
	public static void main(String[] args) {
	    Security ow = new Owner();
	    Security em = new Employee();
	    Security cl = new Client();
	    
	    ow.response();
	    em.response();
	    cl.response();

	    

	}
}

/*
Output : 

Owner plans Security guidelines.                                                                                        
Employee follows security guidelines.                                                                                   
Client follows Employee's instructions.  

*/
