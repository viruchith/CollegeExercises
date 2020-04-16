#include <stdio.h>
#include <math.h>
void main(){
int n=0,x=0;
printf("Enter x :");
scanf("%d",&x);
printf("Enter n :");
scanf("%d",&n);
for(int i =0;i<=n;i++){
    printf("%.lf + ",pow(x,i));
}
}
/*
Output:
Enter x :2
Enter n :5
1 + 2 + 4 + 8 + 16 + 32 +
*/
