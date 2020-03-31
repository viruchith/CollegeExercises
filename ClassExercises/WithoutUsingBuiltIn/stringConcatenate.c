//Program to concatenate two strings
#include <stdio.h>
void main(){
char arr1[100];
char arr2[60];
int i=0,j=0;
printf("Enter string 1 : ");
gets(arr1);
printf("Enter string 2 : ");
gets(arr2);
while(arr1[i]!='\0'){
    i++;
}
while(arr2[j]!='\0'){
    arr1[i]=arr2[j];
    i++;
    j++;

}
printf("Concatenated String : %s",arr1);
}
/*
Output:
Enter string 1 : this is string1
Enter string 2 : this is string2
Concatenated String : this is string1this is string2
*/
