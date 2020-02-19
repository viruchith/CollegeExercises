//To find whether a number is prime or not
#include <stdio.h>
void main(){
int n,flag;
printf("Enter number: ");
scanf("%d",&n);
flag=0;
for(int i=2;i<n;i++){
    if(n%i==0){
        flag=1;
        break;
    }
}
(flag==1)?printf("Not a Prime"):printf("Is a prime");
}
/*
Output:
Enter number: 7
Is a prime
*/
