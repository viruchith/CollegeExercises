//Program to compare two strings
#include <stdio.h>
void main(){
char arr1[60];
char arr2[60];
int flag=0;
printf("Enter String 1 :");
gets(arr1);
printf("Enter String 2 :");
gets(arr2);
for(int i=0;i<60;i++){
if(arr1[i]==arr2[i])
    flag=0;
else
    flag=1;
    break;
}
(flag==0)?printf("Strings are equal"):printf("Strings are not equal");
}
/*
Output:
Enter String 1 :hello world
Enter String 2 :hello world
Strings are equal
*/
