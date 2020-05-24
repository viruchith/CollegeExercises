#include <stdio.h>
void main(){
int arr[7]={4,3,7,2,6,1,5},t=0;
int *ptr=&arr[0];
for(int i=0;i<7;i++){
    for(int j =0;j<7;j++){
        if(*(ptr+i)<*(ptr+j)){
            t=*(ptr+i);
            *(ptr+i)=*(ptr+j);
            *(ptr+j)=t;
        }
    }
}
printf("Ascending order : ");
for(int i =0;i<7;i++)
    printf("%d ",*(ptr+i));
}

/*
Output :

Ascending order : 1 2 3 4 5 6 7
*/
