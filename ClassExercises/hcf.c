//To find HCF or GCD of two numbers.
#include <stdio.h>
void main()
{
	int a,b;
	printf("Enter a:");
	scanf("%d",&a);
	printf("\nEnter b:");
	scanf("%d",&b);
	while(a!=b){
		if(a>b){
			a=a-b;}
		else{
			b=b-a;
			}
		}
printf("\nGCD: %d",a);
}
