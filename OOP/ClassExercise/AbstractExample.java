/*
Write Java code using the concept ”Abstract class”.
*/

abstract class GraphicObject{
    abstract void draw();
}

class Rectangle extends GraphicObject{
    void draw(){
        System.out.println("Drawing Rectangle... ");
    }
}

class Line extends GraphicObject{
    void draw(){
        System.out.println("Drawing Line... ");
    }
}

class Bezier extends GraphicObject{
    void draw(){
        System.out.println("Drawing Bezier Curve... ");
    }
}

class Circle extends GraphicObject{
void draw(){
        System.out.println("Drawing Circle... ");
    }    
}

public class AbstractExample
{
	public static void main(String[] args) {

    Rectangle rt = new Rectangle();
    Line li = new Line();
    Bezier be = new Bezier();
    Circle ci = new Circle();
    
    rt.draw();
    li.draw();
    be.draw();
    ci.draw();
	    
	}
}

/*Output : 

Drawing Rectangle... 
Drawing Line... 
Drawing Bezier Curve... 
Drawing Circle... 



*/
