/*
Write a program to explain the multithreading with the use of multiplication tables. 
Three threads must be defined. Each one must create one multiplication table; 
they are 5th table, 7th table and 10th table
*/

class Table extends Thread {
    private int n = 1;
    public void setN(int n){
        this.n = n;
    }
    public void run(){
        display();
    }
    protected void display(){
        for(int i = 1 ;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
    
}

class FifthTable extends Table{
    
    FifthTable(){
        setN(5);
    }
}

class SeventhTable extends Table{
    
    SeventhTable(){
        setN(7);
    }
}

class TenthTable extends Table{
    
    TenthTable(){
        setN(10);
    }
}

public class Main
{
	public static void main(String[] args) {
	   
	   FifthTable ft = new FifthTable();
	   SeventhTable st = new SeventhTable();
	   TenthTable tt = new TenthTable();
	   
	   // when uncommented prints tables one after another
	   /*
	   ft.setPriority(1);
	   st.setPriority(2);
	   tt.setPriority(3);*/
	   
	   ft.start();
	   st.start();
	   tt.start();

	}
}


/*
Output ( without thread priority ) : 

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
10 x 1 = 10
10 x 2 = 20
10 x 3 = 30
10 x 4 = 40
10 x 5 = 50
10 x 6 = 60
10 x 7 = 70
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

*/
