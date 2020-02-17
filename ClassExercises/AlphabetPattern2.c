//To create a pattern as obtained in the output below
#include <stdio.h>
void main(){
int n=7,a=65;
for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        printf("%c ",a);
        a++;
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
*/
