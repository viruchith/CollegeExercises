#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void main(){
float r1,r2,stmt,a,b,c;
printf("Enter a b c:");
scanf("%f %f %f",&a,&b,&c);
stmt=b*b-4*a*c;
if(stmt>0){
    r1=(-b+sqrt(stmt))/(2*a);
    r2=(-b-sqrt(stmt))/(2*a);
    printf("Roots are real and distinct r1=%f r2=%f",r1,r2);
    }
else if(stmt==0){
    r1=-b/(2*a);
    r2=-b/(2*a);
    printf("Roots are real and equal r1=%f r2=%f",r1,r2);
}
else{
    printf("Roots are imaginary r1=%f r2=%f",r1,r2);
}
}
/*
Output:
Enter a b c:1 2 1
Roots are real and equal r1=-1.000000 r2=-1.000000
*/
