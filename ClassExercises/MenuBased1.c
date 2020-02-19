//To create a Menu Based calcuator program with the menu to calculate 1.Factorial 2.Odd or EVen 3.Prime or Not 4.Exit.
#include <stdio.h>
#include <stdlib.h>//Mandatory to use exit() function.
void main(){
int choice,n,fact,flag;
while(1){
printf("\n*********************************************\n");
printf("\n1.Factorial.\n2.Odd or Even.\n3.Prime or not.\n4.Exit.\n");
printf("\nEnter choice: ");
scanf("%d",&choice);
if(choice==4){
printf("\nExiting program..............");
exit(0);//exit(0) where 0 means Succesful Termination of the program
}
printf("Enter number: ");
scanf("%d",&n);
switch(choice){
case 1:
    fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    printf("\nFactorial of %d = %d",n,fact);
    break;

case 2:
    (n%2==0)?printf("\n%d is Even",n):printf("\n%d is Even",n);
    break;

case 3:
    flag=0;
    for(int i=2;i<n;i++){
        if(n%i==0){
        flag=1;
        break;
        }
    }
    (flag==1)?printf("\nNot a Prime"):printf("\nIs a prime");
    break;

default:
    printf("\nInvalid Choice!!!!");
    break;
}
printf("\n*********************************************\n");
}
}
/*
Output:
*********************************************

1.Factorial.
2.Odd or Even.
3.Prime or not.
4.Exit.

Enter choice: 1
Enter number: 5

Factorial of 5 = 120
*********************************************

*********************************************

1.Factorial.
2.Odd or Even.
3.Prime or not.
4.Exit.

Enter choice: 3
Enter number: 47

Is a prime
*********************************************

*********************************************

1.Factorial.
2.Odd or Even.
3.Prime or not.
4.Exit.

Enter choice: 4

Exiting program..............
*/
