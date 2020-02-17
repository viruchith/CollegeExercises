#include <stdio.h>
void main(){
int n,t,res=0;
printf("Enter num:");
scanf("%d",&n);
t=n;
while(n!=0){
    res=res*10+(n%10);
    n=n/10;
}
(res==t)?printf("Is a Palindrome"):printf("Not a Palindrome");
}
/*
Output:
Enter num:121
Is a Palindrome
*/
