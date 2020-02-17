#include <stdio.h>
void main(){
short int flag=0;
int low,high;
printf("Enter low:");
scanf("%d",&low);
printf("Enter high:");
scanf("%d",&high);
for(int i=low;i<high;i++){
    flag=0;//Is a prime number
    for(int j=2;j<i;j++){
        if(i%j==0){
            flag=1;//Not a prime number
            break;
        }
    }
(flag==0)?printf("\n%d",i):printf("");//If prime print num else do nothing
}
}
/*
Output:
Enter low:50
Enter high:100
53
59
61
67
71
73
79
83
89
97
*/
