#include <stdio.h>
void main(){
int n,rows;
printf("Enter rows:");
scanf("%d",&rows);
for(int i=rows;i>0;i--){
    n=rows;
    for(int j=0;j<i;j++){
        printf("%d ",n--);
    }
printf("\n");
}
}
/*
Output:
Enter rows:7
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
*/
