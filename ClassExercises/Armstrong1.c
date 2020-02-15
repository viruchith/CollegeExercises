#include <stdio.h>
int n,t,i,sum;
void main(){
printf("Enter n:");
scanf("%d",&n);
t=n;
sum=0;
while(n!=0){
    i=n%10;
    sum=sum+(i*i*i);
    n=n/10;
}
(sum==t)?printf("Armstrong Number"):printf("Not an armstrong Number");
}
/*
Output:
Enter n:153
Armstrong Number
*/
