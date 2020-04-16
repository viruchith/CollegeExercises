#include <stdio.h>
void main(){
int arr[10],sum=0;
for(int i=0;i<10;i++){
        printf("Enter num %d : ",i+1);
        scanf("%d",&arr[i]);
        sum+=arr[i];
}
printf("Sum of numbers in array = %d",sum);
}
/*
Output:
Enter num 1 : 1
Enter num 2 : 2
Enter num 3 : 3
Enter num 4 : 4
Enter num 5 : 5
Enter num 6 : 6
Enter num 7 : 7
Enter num 8 : 8
Enter num 9 : 9
Enter num 10 : 10
Sum of numbers in array = 55
*/
