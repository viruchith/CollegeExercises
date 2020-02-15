#include "stdio.h"
void main()
{
int t,n=10;
t=65;
for(int i=1;i<=n;i++){
for(int j = 0;j<i&&t<91;j++){
printf("%c",t);
printf(" ");
t++;
}
printf("\n");
}
}
/*
Output:
A
B C
D E F
G H I J
K L M N O
P Q R S T U
V W X Y Z
*/
