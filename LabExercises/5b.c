#include <stdio.h>
void main(){
char ch;
printf("Enter Code:");
scanf("%c",&ch);
switch(ch){
case 'V':
    printf("Violet");
    break;
case 'I':
    printf("Indigo");
    break;
case 'B':
    printf("Blue");
    break;
case 'G':
    printf("Green");
    break;
case 'Y':
    printf("Yellow");
    break;
case 'O':
    printf("Orange");
    break;
case 'R':
    printf("Red");
    break;
default:
    printf("Invalid Code");
    break;
}
}
/*
Output:
Enter Code:I
Indigo
*/
