#include <stdio.h>
void main()
{
	int a,b,great,lcm;
	printf("Enter a:");
	scanf("%d",&a);
	printf("\nEnter b:");
	scanf("%d",&b);
	great=(a>b)?a:b;
	while(1){
	if(great%a==0 && great%b==0){
	lcm=great;
	break;
			}
else{
great+=1;}
}
printf("\n LCM: %d",great);
}

/*
Enter a:10
Enter b:15
LCM: 30
 */
