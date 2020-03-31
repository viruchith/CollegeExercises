//Program to find the length of a string
#include <stdio.h>
void main(){
char arr[60];
int i=0,count=0;
printf("Enter string: ");
gets(arr);
while(arr[i]!='\0' && i<50){
  count++;
  i++;
}
printf("Length: %d",count);
}
/*
Output:
Enter string: This is a sentence
Length: 18
*/
