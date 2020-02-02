#include <stdio.h>
#include <stdlib.h>
void main(){
float c,f,x=25,y=128.8;
f=(x*9/5)+32;
c=(y-32)*5/9;
printf("%0.2fC = %0.2fF",x,f);
printf("\n%0.2fF = %0.2fC",y,c);
}
/*
Output:
25.00C = 77.00F
128.80F = 53.78C
*/
