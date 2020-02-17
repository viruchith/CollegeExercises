#include <stdio.h>
void main(){
int rows;
printf("Enter rows:");
scanf("%d",&rows);
for(int i=0;i<rows;i++){
    for(int j=0;j<rows;j++){
        printf("* ");
    }
printf("\n");
}
}
/*
Output:
Enter rows:7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

*/
