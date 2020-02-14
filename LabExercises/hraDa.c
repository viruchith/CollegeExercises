#include <stdio.h>
void main()
{
int b,loan;
float hra,da,sp,final;
printf("Enter basic:");
scanf("%d",&b);
if(b<10000){
da=b*(25/100);
hra=b*(15/100);
sp=b*(5/100);
loan=500;
}else if(b>=10000 && b<=50000){
da=b*(35/100);
hra=b*(25/100);
sp=b*(10/100);
loan=1000;
}else{
da=b*(50/00);
hra=b*(30/100);
sp=b*(20/100);
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
