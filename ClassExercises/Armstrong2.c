//to print Armstrong numbers in range 100 to 1000
#include <stdio.h>
int n,t,i,sum;
void main(){
for(int j=100;j<1000;j++){
n=j;
t=n;
sum=0;
while(n!=0){
    i=n%10;
    sum=sum+(i*i*i);
    n=n/10;
}
if(sum==t)
    printf("\nArmstrong Number: %d",sum);
}
}
/*
Output:
Armstrong Number: 153
Armstrong Number: 370
Armstrong Number: 371
Armstrong Number: 407
*/
