//Program to remove vowels from a given string
#include <stdio.h>
void main(){
int i=0,j=0;
char arr1[60];
char arr2[60];
printf("Enter string : ");
gets(arr1);
while(arr1[i]!='\0'){
    if(arr1[i]!='a'&&arr1[i]!='e'&&arr1[i]!='i'&&arr1[i]!='o'&&arr1[i]!='u'&&arr1[i]!='A'&&arr1[i]!='E'&&arr1[i]!='I'&&arr1[i]!='O'&&arr1[i]!='U'){
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
Enter string : Tis sentence contains vowel
After Removal : Ts sntnc cntns vwl
*/
