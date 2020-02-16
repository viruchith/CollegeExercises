#include <stdio.h>
void main(){
char ch;
printf("Enter Char:");
scanf("%c",&ch);
if((((int)ch)>=65&&((int)ch)<=90)||(((int)ch)>=97&&((int)ch)<=122)){
switch(ch){
case 'a':
    printf("%c is a vowel",ch);
    break;
case 'e':
    printf("%c is a vowel",ch);
    break;
case 'i':
    printf("%c is a vowel",ch);
    break;
case 'o':
    printf("%c is a vowel",ch);
    break;
case 'u':
    printf("%c is a vowel",ch);
    break;
case 'A':
    printf("%c is a vowel",ch);
    break;
case 'E':
    printf("%c is a vowel",ch);
    break;
case 'I':
    printf("%c is a vowel",ch);
    break;
case 'O':
    printf("%c is a vowel",ch);
    break;
case 'U':
    printf("%c is a vowel",ch);
    break;
default:
    printf("%c is a consonant",ch);
    break;
}
}else{
printf("Invalid Character");
}
}
/*
Output:
Enter Char:U
U is a vowel
*/
