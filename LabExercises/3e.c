#include <stdio.h>
#include <stdlib.h>
#define pi 3.1415
char ch;
int a,b;
float vol,r,h;
void sphereVolume(){
printf("Enter radius:");
scanf("%d",&a);
r=(float)a;
vol=1.333*pi*(r*r*r);// 4/3=1.333
printf("Volume of Sphere = %.2f",vol);
}
void coneVolume(){
printf("Enter radius:");
scanf("%d",&a);
printf("Enter height:");
scanf("%d",&b);
r=(float)a;
h=(float)b;
vol=pi*r*r*h/3;
printf("Volume of Cone = %.2f",vol);
}
void cylinderVolume(){
printf("Enter radius: ");
scanf("%d",&a);
printf("Enter height: ");
scanf("%d",&b);
r=(float)a;
h=(float)b;
vol=pi*r*r*h;
printf("Volume of cylinder = %.2f",vol);
}
void main(){
printf("1.Volume of Sphere\n2.Volume of Cone\n3.Volume of Cylinder\n");
printf("Enter choice:");
scanf("%c",&ch);
if(ch=='1')
    sphereVolume();
else if(ch=='2')
    coneVolume();
else
    cylinderVolume();
}
/*
Output:
1.Volume of Sphere
2.Volume of Cone
3.Volume of Cylinder
Enter choice:3
Enter radius: 2
Enter height: 5
Volume of cylinder = 62.83
*/
/*
Output:
Enter choice:2
Enter radius:2
Enter height:5
Volume of Cone = 20.94
*/
/*
Output:
Enter choice:1
Enter radius:5
Volume of Sphere = 523.45
*/
