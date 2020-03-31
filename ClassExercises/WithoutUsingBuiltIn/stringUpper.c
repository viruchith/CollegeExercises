//Program to convert given string to upperCase
#include <stdio.h>
void main(){
char arr[60];
int i=0;
printf("Enter string  :");
gets(arr);
while(arr[i]!=0){
if(((int)(arr[i]))>=97&&((int)(arr[i]))<=122)
    arr[i]=(char)(((int)arr[i])-32);
i++;
}
printf("Coverted string : %s",arr);
}
/*
Ouput:
Enter string  :this is lower
Coverted string : THIS IS LOWER
*/
