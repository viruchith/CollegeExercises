/*
Complete the below java program by incorporating appropriate method overloading.

*/
import java.util.Scanner ;

class Add{
    void add(int e1,int e2){
        System.out.println(e1+e2);
    }
    
    void add(int e1,int e2,int e3){
        System.out.println(e1+e2+e3);

    }
    
    void add(double e4,double e5){
        System.out.println(e4+e5);
    }
    
}

class Math{
    public static void main(String args[]){
        int e1,e2,e3 ;
        double e4,e5 ;
        Scanner sc = new Scanner(System.in);
        e1 = sc.nextInt();
        e2 = sc.nextInt();
        e3 = sc.nextInt();

        e4 = sc.nextDouble();
        e5 = sc.nextDouble();

        Add ob = new Add();
        
        ob.add(e1,e2);
        ob.add(e1,e2,e3);
        ob.add(e4,e5);
        
        
    }
}
