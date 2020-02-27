/*
#In this Puzzle there are 21 Match Sticks.
#You and Computer will pick up the sticks one by one.
#Sticks can be picked from 1 to 4.
#The who, picked up the last stick, is the winner. 
*/

#include <stdio.h>
void main(){
int sum=0,c,u;
printf("Sum: %d",sum);
while(1){
    printf("\nEnter a num: ");
    scanf("%d",&u);
    sum+=u;
    printf("\nSum: %d",sum);
    for(int i=1;i<=4;i++){
        if(((sum+i)%3==0)||((sum+i)%7==0)){
            c=i;
        }
    }

        printf("\ncomputer %d",c);
        sum+=c;
        printf("\nSum: %d",sum);
        if(sum==21){
            printf("\nComputer Won the game!!!");
            break;
        }

}
}
/*
Output:

Sum: 0
Enter a num: 3

Sum: 3
computer 4
Sum: 7
Enter a num: 2

Sum: 9
computer 3
Sum: 12
Enter a num: 1

Sum: 13
computer 2
Sum: 15
Enter a num: 4

Sum: 19
computer 2
Sum: 21
Computer Won the game!!!
*/
