/*
Design and write a class to represent a bank account that includes the following members: 

    Data members 
        Owner name 
        Account number 
        Balance amount in the account 
    Methods members 
        To assign initial values 
        To deposit an amount 
        To withdraw an amount after checking balance 
        To display the owner name and balance
    incorporate a constructor to provide initial values.
    Write a main method for the above class that reads in the initial values from the keyboard.

public static void main(String[] args){

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

                 

        System.out.print("Please Enter an Account Number: ");

        int num = Integer.parseInt(obj.readLine());

       

        System.out.print("Please Enter the Account Holder Name: ");

        String name = obj.readLine();

        

        System.out.print("Please Enter the Balance: ");

        double blns = Double.parseDouble(obj.readLine());

        

        BankAccount acc = new BankAccount(name, num, blns);

        acc.display();

        acc.deposit(blns);

        acc.display();

        

        acc.withdraw(2*blns);

        acc.display();

        

        acc.withdraw(blns);

        acc.display();

    }


Sample Output:

Please Enter an Account Number: 1001                                  

Please Enter the Account Holder Name: Dhaya                          

Please Enter the Balance: 120000                                      

Account Holder Name: Dhaya                                            

Account Balance: 120000.0                                             

Account Holder Name: Dhaya                                            

Account Balance: 240000.0                                             

Error: Insufficient fund or Invalid amount!                           

Account Holder Name: Dhaya                                            

Account Balance: 240000.0                                             

Account Holder Name: Dhaya                                            

Account Balance: 120000.0 
*/


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
