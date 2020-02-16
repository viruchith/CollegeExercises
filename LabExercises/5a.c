#include <stdio.h>
void main(){
int a=0,b=0,c=0;
char ch;
printf("Enter a:");
scanf("%d",&a);
printf("Enter b:");
scanf("%d",&b);
printf("Enter OP:");//Operation to be performed
scanf("\n%c",&ch);

switch(ch){
case '+':
    c=a+b;
    break;
case '-':
    c=a-b;
    break;
case '*':
    c=a*b;
    break;
case '/':
    c=a/b;
    break;
case '%':
    c=a%b;

default:
    c=a+b;
    break;
}
printf("a %c b = %d",ch,c);
}
/*
Output:
Enter a:78
Enter b:3
Enter OP:/
a / b = 26
*/
