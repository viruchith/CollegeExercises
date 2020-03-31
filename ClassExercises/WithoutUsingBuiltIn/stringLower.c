//Program to convert given string to lowerCase
#include <stdio.h>
void main(){
char arr[60];
int i=0;
printf("Enter string  :");
gets(arr);
while(arr[i]!=0){
if(((int)(arr[i]))>=65&&((int)(arr[i]))<=90)
    arr[i]=(char)(((int)arr[i])+32);
i++;
}
printf("Coverted string : %s",arr);
}
/*
Ouput:
Enter string  :This Is Capital
Coverted string : this is capital
*/
