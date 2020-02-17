//To print the Alphabet Star Pattern as obtained in the output.
#include <stdio.h>
void main()
{
int n=7,b,a,x;// n= 7 Rows
b=71;
for(int i=0;i<n;i++){
	a=65;
	for(int k =0;k<=n-i-1;k++){
		printf("%c ",a);
		a++;
		}
	for(int j=1;j<=i;j++){
		printf("  ");
		}
    for(int j=2;j<=i;j++){
		printf("  ");
		}
		x=b;
	for(int l=0;l<=n-i-1;l++){
		if(i!=0&&x!=71&&x>=65)
        {
        printf("%c ",x);
		x--;
		}
		else{
		    x--;
		if(x>=65){
            printf("%c ",x);
            }
		}
		}
		b--;
	printf("\n");
	}
}
/*
Output:
A B C D E F G F E D C B A
A B C D E F   F E D C B A
A B C D E       E D C B A
A B C D           D C B A
A B C               C B A
A B                   B A
A                       A
*/
