import java.io.*;

class BankAccount{
    private String name;
    private int num;
    private double balance;

    BankAccount(String name,int num,double balance){
        this.name = name ;
        this.num = num ;
        this.balance = balance ;
        
    }
    
    protected void deposit(double amount){
        if(amount>0){
            this.balance+= amount ;
        }else{
            System.out.println("Invalid Amount !") ;
        }
    } 
    
    protected void withdraw(double amount){
        if(amount > balance || amount<0 ){
            System.out.println("Insufficient balance");
        }else{
            this.balance -= amount ;
        }
    }
    
    protected void display(){
        System.out.println("Account Holder : "+this.name);
        System.out.println("Account Balance : "+this.balance) ;
        
    }
    
}

class Bank{
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            
            System.out.println("Please Enter an Account Number : ");
            int num = Integer.parseInt(br.readLine());
            
            System.out.println("Please Enter Account Holder Name : ");
            String name = br.readLine();
            
            System.out.println("Please Enter Account Balance : ");
            double balance = Double.parseDouble(br.readLine());
            
            BankAccount acc = new BankAccount(name,num,balance);
            
            acc.display();
            acc.deposit(balance);
            acc.display();
            
            acc.withdraw(2*balance+1.0); 
            /*
            if not the balance will be sufficient
            for withdrawl
            */
            acc.display();
            
            acc.withdraw(balance);
            acc.display();
            
        }catch(IOException ie){
            
        }
    }
}
