#include <stdio.h>
void main(){
int arr[6]={5,6,3,8,7,2},greatest=0,count=0,least=0;
for(int i=0;i<6;i++){
    if(count==0){
        least=arr[i];
    }
    if(arr[i]>greatest){
        greatest=arr[i];
    }
    if(arr[i]<least){
        least=arr[i];
    }
    count++;
}
printf("Greatest num = %d\nLeast num = %d",greatest,least);
}
/*
Output:
Greatest num = 8
Least num = 2
*/
