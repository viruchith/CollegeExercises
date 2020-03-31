//Program to swap values of two string
#include <stdio.h>
void main(){
char arr1[60];
char arr2[60];
int i=0;
char t;
printf("Enter string1 : ");
gets(arr1);
printf("Enter string2 : ");
gets(arr2);
while(arr1[i]!='\0'||arr2[i]!='\0'){
    t=arr1[i];
    arr1[i]=arr2[i];
    arr2[i]=t;
    i++;
}
printf("String 1 : %s\n",arr1);
printf("String 2 : %s",arr2);
}

/*
Output:
Enter string1 : Bill
Enter string2 : Kill
String 1 : Kill
String 2 : Bill
*/
