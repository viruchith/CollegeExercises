//To find the sum of first and last digits of a number
#include <stdio.h>
int main()
{
    int n,t,s,e,sum;
    printf("Enter n:");
    scanf("%d",&n);
    t=n;
    while(n!=0){
        if (n==t){
            e=n%10;
            n/=10;
        }else{
            s=n%10;
            n/=10;
        }
    }
sum=s+e;
printf("1st= %d  last= %d sum= %d",s,e,sum);

    return 0;

}
/*
Output:
Enter n:1234
1st= 1  last= 4 sum= 5
*/
