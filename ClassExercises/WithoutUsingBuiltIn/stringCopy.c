//Program to copy one string to another
#include <stdio.h>
void main(){
char arr1[60];
char arr2[60];
int i=0;
printf("Enter string : ");
gets(arr1);
while(arr1[i]!='\0'){
    arr2[i]=arr1[i];
    i++;
}
arr2[i]='\0';
printf("Copied string : %s",arr2);
}
/*
Output:
Enter string : kadhal psycho
Copied string : kadhal psycho
*/
