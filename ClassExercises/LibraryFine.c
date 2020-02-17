#include <stdio.h>
void main(){
float fine=0;
int days;
printf("Enter Days:");
scanf("%d",&days);
if(days<=5){
    fine=days*0.5;
}
else if(days>=6&&days<=10){
    fine=days*1;
}else if(days>10&&days<30){
    fine=days*5;
}
if(fine>0){
    printf("Your Fine amount is Rs.%.1f",fine);
}else{
printf("Your Membership has been Cancelled!");
}
}
/*
Output:
Enter Days:15
Your Fine amount is Rs.75.0
*/
