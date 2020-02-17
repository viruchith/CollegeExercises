#include <stdio.h>
int i,j,k,n;
void main(){
printf("Rows:");
scanf("%d",&n);
for(i=0;i<=n;i++){
for(j=0;j<=n-i-1;j++){
    printf(" ");
}
for(k=0;k<i;k++){
    printf("*");
    printf(" ");
}
printf("\n");
}
}
/*
Output:
Rows:7

      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
*/
