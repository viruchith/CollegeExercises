#include <stdio.h>
void main(){
int n=0,a=0,b=1,c=0;
printf("Enter n :");
scanf("%d",&n);
for(int i =0;i<n;i++){
c=a+b;
a=b;
b=c;
printf("%d\n",a);
}
}
/*
Output:
Enter n :5
1
1
2
3
5
*/
