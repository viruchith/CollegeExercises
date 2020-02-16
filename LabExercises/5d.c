#include <stdio.h>
void main(){
char day='1';
printf("Enter Day:");
scanf("%c",&day);
switch(day){
case '1':
    printf("Sunday");
    break;
case '2':
    printf("Monday");
    break;
case '3':
    printf("Tuesday");
    break;
case '4':
    printf("Wednesday");
    break;
case '5':
    printf("Thursday");
    break;
case '6':
    printf("Friday");
    break;
case '7':
    printf("Saturday");
    break;
default:
    printf("Only 7 days in a week !");
    break;
}
}
/*
Output:
Enter Day:7
Saturday
*/
