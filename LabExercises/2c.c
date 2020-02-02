#include <stdio.h>
#include <stdlib.h>
void main(){
float r,a,pi=3.1415;
printf("Enter radius: ");
scanf("%f",&r);
a=pi*r*r;
printf("Radius in floating form: %f",a);
printf("\nRadius in exponential form: %e",a);
}
/*
Output:
Enter radius: 2.7
Radius in floating form: 22.901535
Radius in exponential form: 2.290154e+01
*/
