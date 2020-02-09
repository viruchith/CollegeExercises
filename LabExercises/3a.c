#include <stdio.h>
#include <stdlib.h>
void main(){
int a=1,b=0;
printf("1>0= %d",a<b);
printf("\n0>1= %d",b>a);
printf("\n1>=0 = %d",a>=b);
printf("\n1<0 = %d",a<b);
printf("\n0<=1 = %d",b<=a);
printf("\n1!=0 = %d",a!=b);
printf("\na==b = %d",a==b);
if (a>b)
    printf("\n1>0");
if (a!=b)
    printf("\n1!=0");
}
/*
Output:
1>0= 0
0>1= 0
1>=0 = 1
1<0 = 0
0<=1 = 1
1!=0 = 1
a==b = 0
1>0
1!=0
*/
