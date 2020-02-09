#include <stdio.h>
#include <stdlib.h>
float cost;
int u;
void main(){
printf("Enter units:");
scanf("%d",&u);
if(u>=1&&u<=100)
    cost=1.50*u;
else if(u>=101&&u<=300)
    cost=2.0*u;
else if(u>=301&&u<=500)
    cost=2.5*u;
else
    cost=3.25*u;

printf("Electricity bill = Rs%.2f",cost);
}
/*
Output:
Enter units:501
Electricity bill = Rs1628.25
*/
