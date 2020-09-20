/*
Explain the concept of overriding with examples. Write a program to create a class named shape. 
In this class we have three sub classes circle, triangle and square each class has two member function named draw () and erase (). 
Create these using polymorphism concepts.
*/

class Shape{
    void draw(){
        System.out.println("Drawing Shape....");
    }
    
    void erase(){
        System.out.println("Erasing Shape....");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
    
    @Override
    void erase(){
        System.out.println("Erasing Circle...");
    }
}

class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Triangle...");
    }
    
    @Override
    void erase(){
        System.out.println("Erasing Triangle...");
    }
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Square...");
    }
    
    @Override
    void erase(){
        System.out.println("Erasing Square...");
    }
}
public class OverrideShape
{
	public static void main(String[] args) {
	    Circle c = new Circle();
	    Triangle t = new Triangle();
	    Square s = new Square();
	    
	    c.draw();
	    c.erase();

        t.draw();
	    t.erase();

        s.draw();
	    s.erase();
	    
	}
}

/*
Output : 

Drawing Circle...                                                                                                       
Erasing Circle...                                                                                                       
Drawing Triangle...                                                                                                     
Erasing Triangle...                                                                                                     
Drawing Square...                                                                                                       
Erasing Square...
*/
