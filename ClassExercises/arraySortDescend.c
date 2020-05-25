#include <stdio.h>
#include <stdlib.h>
void main(){
int *arr,t=0,n;
printf("Enter no of items : ");
scanf("%d",&n);
arr=(int *)calloc(n,sizeof(int));
for(int i=0;i<n;i++){
    printf("Enter arr[%d]",i);
    scanf("%d",arr+i);
}
for(int i=0;i<n;i++){
    for(int j =0;j<7;j++){
        if(*(arr+i)>*(arr+j)){
            t=*(arr+i);
            *(arr+i)=*(arr+j);
            *(arr+j)=t;
        }
    }
}
printf("\nDescending order : ");
for(int i =0;i<7;i++)
    printf("%d ",*(arr+i));
}

/*
Output :

Enter no of items : 7
Enter arr[0]4
Enter arr[1]3
Enter arr[2]7
Enter arr[3]2
Enter arr[4]6
Enter arr[5]1
Enter arr[6]5

Descending order : 7 6 5 4 3 2
*/
