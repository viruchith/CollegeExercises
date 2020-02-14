#include <stdio.h>
void main()
{
int b,loan;
float hra,da,sp,final;
printf("Enter basic:");
scanf("%d",&b);
if(b<10000){
da=b*0.25;
hra=b*0.15;
sp=b*0.05;
loan=500;
}else if(b>=10000 && b<=50000){
da=b*0.35;
hra=b*0.25;
sp=b*0.1;
loan=1000;
}else{
da=b*0.5;
hra=b*0.3;
sp=b*0.2;
loan=1500;
}
final=da+hra+sp+b-loan;
printf("Final pay=₹%.2f",final);	
}
/*
Output:
Enter basic:20000
Final pay=₹19000.00                                      
*/
