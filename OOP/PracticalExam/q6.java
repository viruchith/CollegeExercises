/*

i. The much awaited event at the entertainment industry every year is the "Screen Awards". This year the event is going to be organized on December 25 to honour the Artists for their professional excellence in Cinema. The Organizers has this time decided to launch an online portal to facilitate easy booking of the Award show’s tickets.

They specifically wanted to provide an option for bulk booking in the portal, wherein there are many discounts announced. Write a program to help the Organizers to create the portal as per the requirement given below.

Given the ticket cost as 'X'.

If the number of tickets purchased is less than 50, there is no discount.

If the number of tickets purchased is between 50 and 100 (both inclusive), then 10% discount is offered.

If the number of tickets purchased is between 101 and 200(both inclusive), 20% discount is offered.

If the number of tickets purchased is between 201 and 400(both inclusive), 30% discount is offered.

If the number of tickets purchased is between 401 and 500(both inclusive), 40% discount is offered.

If the number of tickets purchased is greater than 500, then 50% discount is offered.

Input Format
First line of the input is an integer that corresponds to the cost of the ticket ‘X’.

Second line of the input is an integer that corresponds to the number of tickets purchased.

Output Format
Output should display a double value, which gives the total expenses in purchasing the tickets after discounts. Display the output correct to 2 decimal places.

Sample 1 Input
100
5
Sample 1 Output
500.00
Sample 2 Input
100
300
Sample 2 Output
21000.00

*/
import java.util.Scanner;

class Main{
    
    private static double applyDiscount(int cost,int count){
        double discount = 0; 
        if( count<50){
             discount=1;
           
        }else if( count>=50 && count<=100 ){
             discount=0.9;
           
        }else if( count>=101 && count<=200 ){
            discount=0.8;
            
        }else if( count>=201 && count<=400 ){
            discount=0.7;
            
        }else if( count>=401 && count<=500 ){
            discount=0.6;
            
        }else if( count>500 ){
            discount=0.5;
            
        }else{
            discount=1;
        }
        
        return (count*(cost*discount));
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cost = sc.nextInt();
        int count = sc.nextInt();

        System.out.println(applyDiscount(cost,count));
    }
}
