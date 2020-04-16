#include <stdio.h>
void main(){
int space=6;
for(int i=0;i<5;i++){
    for(int j=1;j<i+1;j++){
        printf("%d",j);
    }
    for(int k=space;k>-1;k--){
        printf(" ");
    }
    for(int l=1;l<i+1;l++){
        printf(" * ");
    }
    space--;
    printf("\n");
}
}
/*
Output:
1      *
12     * *
123    * * *
1234   * * * *
*/
