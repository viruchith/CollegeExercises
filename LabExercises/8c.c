#include <stdio.h>
void main(){
int arr[10]={1,-6,3,7,-8,0,-4,5,9,0},zcount=0,pcount=0,ncount=0;
for(int i=0;i<10;i++){
    (arr[i]==0)?zcount++:((arr[i]>0)?pcount++:ncount++);
}
printf("zeros : %d",zcount);
printf("\n+ve numbers : %d",pcount);
printf("\n-ve numbers : %d",ncount);
}
/*
Output:
zeros : 2
+ve numbers : 5
-ve numbers : 3
*/
