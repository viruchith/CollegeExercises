#include "stdio.h"
void main()
{
	int n,t,i,res=0;
	scanf("%d",&n);
	t=n;
	while(n!=0){
		i=n%10;
		res=res*10+i;
		n=n/10;
		}
	(t==res)?printf("palindrome"):printf("not a palindrome");
}