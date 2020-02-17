#include <stdio.h>
void main(){
int n,t,sum=0;
printf("Enter num:");
scanf("%d",&n);
t=n;
while(n!=0){
sum=sum+(n%10);
n=n/10;
}
printf("Sum of digits of %d = %d",t,sum);
}
/*
Output:
Enter num:123
Sum of digits of 123 = 6
*/
