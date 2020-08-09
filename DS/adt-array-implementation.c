#include <stdio.h>
#define M 10 //Max size of array
char opt='6';
int arr[M]={0};
int n=0,t=0;
void display();
void search();
void addElements();
void deleteElement();
void insertElement();
//main
void main()
{
short int flag = 0;
while(flag!=1){
printf("\n\n**** Options ****\n1.Display Elements.\n2.Add Elements.\n3.Search Element.\n4.Delete Element.\n5.Insert Element.\n6.Exit.");
printf("\nEnter option : ");
scanf("%d",&opt);
switch(opt){

case 1:
display();
break;


case 2:
addElements();
break;

case 3:
search();
break;

case 4:
deleteElement();
break;

case 5:
insertElement();
break;

case 6:
flag=1;
break;

default:
flag = 1;
break;
}
printf("\nExiting program.......");
}


}
void display(){
printf("\n Array : ");
for(int i=0;i<n;i++){
    printf(" %d ",arr[i]);
}
}
//add elements to array
void addElements(){
printf("\nEnter no of elements : ");
scanf("%d",&n);
for(int i=0;i<n;i++){
    printf("\nEnter %dth element : ",i+1);
    scanf("%d",&arr[i]);
}
printf("\n Array created ...");
display();
}

//search element
void search(){
int pos=0,flag=0;
printf("\nEnter element to be searched : ");
scanf("%d",&t);
for(int i=0;i<n;i++){
    if(t==arr[i]){
        pos=i;
        flag=1;
        break;
    }
}
if(flag==1){
    printf("\n%d is found at position %d",t,pos+1);
}else{
printf("\n%d is not present in the array !",t);
}
}
void deleteElement(){
int pos=0;
printf("\nEnter element position to be deleted : ");
scanf("%d",&pos);
if(pos<n){
    for(int i=pos-1;i<n;i++){
    arr[i]=arr[i+1];
    }
    n--;
}
printf("\nelement Deleted Successfully !");
display();
}
void insertElement(){
int pos=0;
printf("\nEnter position of Element : ");
scanf("%d",&pos);
if(pos<=n){
n++;//increase size for insertion
    for(int i=n;i>=pos;i--){
        arr[i]=arr[i-1];
    }
}else if(pos == (n+1)){
        n++;
    }
printf("\nEnter element to be inserted : ");
scanf("%d",&arr[pos-1]);
display();
}
/*
Output :

**** Options ****
1.Display Elements.
2.Add Elements.
3.Search Element.
4.Delete Element.
5.Insert Element.
6.Exit.
Enter option : 2

Enter no of elements : 10

Enter 1th element : 1

Enter 2th element : 2

Enter 3th element : 3

Enter 4th element : 4

Enter 5th element : 5

Enter 6th element : 6

Enter 7th element : 7

Enter 8th element : 8

Enter 9th element : 9

Enter 10th element : 10

 Array created ...
 Array :  1  2  3  4  5  6  7  8  9  10
Exiting program.......

**** Options ****
1.Display Elements.
2.Add Elements.
3.Search Element.
4.Delete Element.
5.Insert Element.
6.Exit.
Enter option : 4

Enter element position to be deleted : 5

element Deleted Successfully !
 Array :  1  2  3  4  6  7  8  9  10
Exiting program.......

**** Options ****
1.Display Elements.
2.Add Elements.
3.Search Element.
4.Delete Element.
5.Insert Element.
6.Exit.
Enter option : 5

Enter position of Element : 5

Enter element to be inserted : 5

 Array :  1  2  3  4  5  6  7  8  9  10
Exiting program.......

**** Options ****
1.Display Elements.
2.Add Elements.
3.Search Element.
4.Delete Element.
5.Insert Element.
6.Exit.
Enter option : 6

Exiting program.......

*/
