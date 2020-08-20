#include <stdio.h>
#define MAX 5

int arr[MAX];

int top = -1 ;

int isEmpty(){
    if(top == -1){
        return 1;
    }else{
        return 0;
    }
}

int isFull(){
    if( top == MAX-1 ){
        return 1;
    }else{
        return 0;
    }
}


void push(int data ){
    if(isFull()){
        printf("Stack overflow !\n");
        return;
    }
    top+=1;
    arr[top] = data ;
    
}

void pop(){
    if(isEmpty()){
        printf("Stack underflow !\n");
        return;
    }
    top-=1 ;
}

void peek(){
    if(isEmpty()){
        printf("Stack underflow !\n");
        return;
    }
    printf(" %d \n",arr[top]);
}

void display(){
    if(isEmpty()){
        printf("Stack underflow !\n");
        return;
    }
    
    for(int i = top ; i >= 0 ; i-- ){
        printf(" %d ",arr[i]);
    }
    printf("\n");
}

void main(){
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    push(6);// overflow
    display();
    peek();
    pop();
    pop();
    pop();
    pop();
    pop();
    peek();// underflow
}
/*
Output : 

Stack overflow !                                                                                                       
 5  4  3  2  1                                                                                                         
 5                                                                                                                     
Stack underflow ! 

*/
