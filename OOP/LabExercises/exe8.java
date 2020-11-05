/*
Define a class “MyStack” which contains an array and top as data members andimplements the above interface. Initialize the stack using a constructor. Write a menudriven program to perform operations on a stack object.
Hint: Menudriven
*/
import java.io.*;

interface StackOperations{
    
        int max=5;
        void push(int data);
        void pop();
        int isEmpty();
        int isFull();
}

class MyStack implements StackOperations{
    
    private int[] stack = new int[max] ;
    private int top = -1;
    
    

    public int isEmpty(){
        if(this.top<0 || stack.length==0 ){
            return 1;
        }else{
            return 0;
        }
    }
    
    public int isFull(){
        if(this.top==max-1 && this.top< stack.length){
            return 1;
        }else{
            return 0;
        }
    }
    
    public void pop(){
        stack[top] = 0 ;
        this.top-=1;
    }
    
    public void push(int data){
        stack[top+1] = data ;
        this.top+=1;
    }
    
    public void display(){
        System.out.println("The Elements in the Stack are: ");
        for(int i = top ; i>-1 ; i--){
            System.out.println(stack[i]);
        }
    }
    
}

public class Main
{
	public static void main(String[] args)throws IOException {
        int ch,data;
          String c;
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
          MyStack s = new MyStack();
          do
          {
           System.out.println("\n1:Push");
           System.out.println("\n2:Pop");
           System.out.println("\n3:Display.");
           System.out.println("\n4:Exit.");
           System.out.println("\nEnter your choice:");
           ch = Integer.parseInt(br.readLine());
        
           switch(ch){
           case 1:if(s.isFull()==1){
            System.out.println("Stack is full");
            }
            else{ 
             System.out.println("Enter the data:");
             data = Integer.parseInt(br.readLine());
             s.push(data);
            }break;
        
           case 2:if(s.isEmpty()==1){
            System.out.println("Stack is empty");
           }
          else{
           s.pop();
          }break;
        
          case 3:if(s.isEmpty()==1){
           System.out.println("Stack is empty");
          }
          else{
           s.display();
          }break;
        
          case 4:
           System.exit(0);
          default:
           System.out.println("\nInvalid choice");
         }
        }while(ch!=4);
        

	}
}
