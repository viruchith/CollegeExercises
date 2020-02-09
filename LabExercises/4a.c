#include <stdio.h>
#include <stdlib.h>
void main(){
int m1,m2,m3,m4,m5,m6,total,avg;
printf("Enter m1:");
scanf("%d",&m1);
printf("Enter m2:");
scanf("%d",&m2);
printf("Enter m3:");
scanf("%d",&m3);
printf("Enter m4:");
scanf("%d",&m4);
printf("Enter m5:");
scanf("%d",&m5);
printf("Enter m6:");
scanf("%d",&m6);
total=m1+m2+m3+m4+m5+m6;
avg=total/6;
m1>50?printf("m1=Pass"):printf("m1=Fail");
m2>50?printf("\nm2=Pass"):printf("\nm2=Fail");
m3>50?printf("\nm3=Pass"):printf("\nm3=Fail");
m4>50?printf("\nm4=Pass"):printf("\nm4=Fail");
m5>50?printf("\nm5=Pass"):printf("\nm5=Fail");
m6>50?printf("\nm6=Pass"):printf("\nm6=Fail");
if(m1>50&&m2>50&&m3>50&&m4>50&&m5>50&&m6>50)
    printf("\nOverall Result = Pass");
else
    printf("\nOverall Result = Fail");

}
/*
Enter m1:66
Enter m2:78
Enter m3:89
Enter m4:65
Enter m5:56
Enter m6:77
m1=Pass
m2=Pass
m3=Pass
m4=Pass
m5=Pass
m6=Pass
Overall Result = Pass
*/
