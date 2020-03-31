//Program to remove space from a string
#include <stdio.h>
void main(){
int i=0,j=0;
char arr1[60];
char arr2[60];
printf("Enter string : ");
gets(arr1);
while(arr1[i]!='\0'){
    if(arr1[i]!=' '){
        arr2[j]=arr1[i];
        j++;
    }
i++;
}
arr2[j]='\0';
printf("After Removal : %s",arr2);
}
/*
Output:
Enter string : h e ll o  world
After Removal : helloworld
*/
