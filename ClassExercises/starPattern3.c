//To create the Diamond pattern as obtained in the below output
#include <stdio.h>
int i,j,k,n;
void main(){
printf("Rows:");
scanf("%d",&n);
for(i=0;i<=n;i++){//First Pyramid
for(j=0;j<=n-i-1;j++){
    printf(" ");
}
for(k=0;k<i;k++){
    printf("*");
    printf(" ");
}
printf("\n");
}
for(i=n-1;i>=0;i--){//First Pyramid
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
Rows:7

      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
*/
