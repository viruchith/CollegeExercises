#include <stdio.h>
#include <stdlib.h>
void main(){
int a=1,b=0;
printf("1&&0=%d",a&&b);
printf("\n1||0=%d",a||b);
printf("\n(1&&0)||(1||1)&&(1&&0)=%d",(1&&0)||(1||1)&&(1&&0));
}
/*
Output:
1&&0=0
1||0=1
(1&&0)||(1||1)&&(1&&0)=0
*/
