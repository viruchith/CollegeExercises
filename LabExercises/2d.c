#include <stdio.h>
#include <stdlib.h>
void main(){
float p,n,r,si;
printf("Enter p:");
scanf("%f",&p);
printf("Enter n:");
scanf("%f",&n);
printf("Enter r:");
scanf("%f",&r);
si=(p*n*r)/100;
printf("SI= %0.2f",si);
}
/*
Output:
Enter p:1200
Enter n:10
Enter r:17
SI= 2040.0
*/
