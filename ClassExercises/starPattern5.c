#include <stdio.h>
void main(){
int rows;
printf("Enter rows:");
scanf("%d",&rows);
for(int i=0;i<rows;i++){
    for(int j=0;j<i;j++){
        printf("* ");
    }
printf("\n");
}
for(int i=rows-1;i>0;i--){
    for(int j=0;j<i;j++){
        printf("* ");
    }
printf("\n");
}
}
/*
Output:
Enter rows:7

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
