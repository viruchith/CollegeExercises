/*
Look at the Account class Account.java and write a main method in a different class to briefly experiment with some instances of the Account class.

    Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount. A SavingsAccount object, in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account. 
    A CurrentAccount object, in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have overridden methods of the Account class as necessary in both derived classes.
    Now create a Bank class, an object of which contains an array of Account objects. Accounts in the array could be instances of the Account class, the SavingsAccount class, or the CurrentAccountclass. Create some test accounts (some of each type).
    Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.
    The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.

Hints:

    Note that the balance of an account may only be modified through the deposit(double) and withdraw(double) methods.
    The Account class should not need to be modified at all.
    Be sure to test what you have done after each step.

Output:

Savings Account Balance = 10000.0 Interest : 0.25
Current Account Balance = 20000.0 Limit : 1000.0
After updating the interest rate
Savings Account Balance = 10125.0 Interest : 1.25
After updating the withdrawn limit
Current Account Balance = 20000.0 Limit : 2000.0
Withdraw Rs. 1000 from Current Account
Current Account Balance = 19000.0 Limit : 2000.0
Withdraw Rs. 1000 from Current Account
Current Account Balance = 18000.0 Limit : 2000.0
Withdraw Rs. 3000 from Current Account
Sorry, the limit is exceeded
Current Account Balance = 18000.0 Limit : 2000.0



*/
class Account{
   private double bal;
   private int accnum ;
   
   public Account(int a){
       bal = 0.0 ;
       accnum = a ;
   }
   
   public void deposit(double sum){
       if(sum>0)
            bal+=sum ;
        else
            System.err.println("Account.deposit(...): "+"cannot deposit negative amount.");
   }
   
   public void withdraw(double sum){
       if(sum>0)
            bal-=sum ;
        else
            System.err.println("Account.withdraw(...): "+"cannot withdraw negative amount.");
   }
   
   public double getBalance(){
       return bal;
   }
   
   public double getAccountNumber(){
       return accnum;
   }
   
   public String toString(){
       return "Acc "+accnum+": "+"balance = "+bal ;
   }
   
   public final void print(){
       System.out.println(toString());
   }
   
}

class SavingsAccount extends Account{
   
    private double interest ;
    SavingsAccount(int accnum , double sum,double interest){
        super(accnum);
        this.interest = interest ;
        deposit(sum);
    }

    private void addInterest(){
        double sum = (getBalance()*(this.interest/100));
        deposit(sum);
            //System.err.println("SavingsAccount.addInterest(...): "+"cannot add interest");
    }
    
    public void updateInterest(double interest){
        this.interest =interest ;
        addInterest();
    }
    
    @Override
    public String toString(){
        return "Savings Account Balance = "+getBalance()+" "+"Interest : "+this.interest ;

    }
}


class CurrentAccount extends Account{
    private double limit;
    
    CurrentAccount(int accnum , double sum , double limit){
        super(accnum);
        deposit(sum);
        this.limit = limit ;
    }
    
    public void updateLimit(double limit){
        this.limit = limit ;
    }
    
    @Override
    public void withdraw(double sum){
        if(sum>=0 && sum<=limit){
            super.withdraw(sum);
        }else{
            System.out.println("Sorry, the limit is exceeded");
        }
    }
    
    @Override
    public String toString(){
        return "Current Account Balance = "+getBalance()+" "+"Limit : "+this.limit;

    }    
    
}

class Bank {
    
    private Account account ;
    private SavingsAccount savingsAccount ;
    private CurrentAccount currentAccount ;
    
    public void openAccount(int accnum){
        account = new Account(accnum) ;
        System.out.println(this.account.toString());
    }
    
    public void openSavingsAccount(int accnum, double sum, double interest){
        savingsAccount = new SavingsAccount(accnum,sum,interest);
        System.out.println(savingsAccount.toString());
    }
    
    public void openCurrentAccount(int accnum, double sum, double limit){
        currentAccount = new CurrentAccount(accnum,sum,limit);
        System.out.println(currentAccount.toString());
    }
    
    public void updateInterest(double interest){
        savingsAccount.updateInterest(interest);
        System.out.println(savingsAccount.toString());

    }
    
    public void updateLimit(double limit){
        currentAccount.updateLimit(limit);
        System.out.println(currentAccount.toString());
    }
    
    public void withdraw(double amount){
        System.out.println("Withdraw Rs. "+(int)amount+" from Current Account");
        currentAccount.withdraw(amount);
        System.out.println(currentAccount.toString());
    }
    
    
}

public class Main{
    public static void main (String[] args) {
        Bank bank = new Bank() ;
        bank.openSavingsAccount(1001,10000,0.25);
        bank.openCurrentAccount(1002,20000,1000);
        System.out.println("After updating the interest rate");
        bank.updateInterest(1.25);
        System.out.println("After updating the withdrawn limit");
        bank.updateLimit(2000);
        bank.withdraw(1000);
        bank.withdraw(1000);
        bank.withdraw(3000);
        
    }
}
