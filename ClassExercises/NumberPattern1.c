//To obtain a number pattern as obtained in the output below
#include <stdio.h>
void main(){
int n=1,rows=4;
for(int i=0;i<rows+1;i++){
    for(int j=0;j<=rows+1-i-1;j++){
        printf(" ");
    }
    for(int k=0;k<i;k++){
        printf("%d ",n);
        n++;
    }
    printf("\n");
}
}
/*
Output:
    1
   2 3
  4 5 6
 7 8 9 10
*/
