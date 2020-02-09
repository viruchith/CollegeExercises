#include <stdio.h>
#include <stdlib.h>
int a;
void main(){
printf("Enter a: ");
scanf("%d",&a);
printf("a++= %d",a++);
printf("\n ++a= %d",++a);
}
/*
Output:
Enter a: 10
a++= 10
 ++a= 12
*/
