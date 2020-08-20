#include <stdio.h>
#define MAX 5

int arr[MAX];

int front = 0 ,rear = -1 ;

int isEmpty(){
    if(front == rear + 1){
        return 1;
    }else{
        return 0;
    }
}

int isFull(){
    if(rear >= (MAX-1) ){
        return 1;
    }else{
        return 0;
    }
}

void enqueue(int data){
    if(isFull()){
        printf("Queue is full !\n");
        return;
    }
    rear+=1;
    arr[rear]=data;
}

void dequeue(){
    if(isEmpty()){
        printf("Queue is empty !\n");
        return;
    }
    front+=1;
}

void display(){
    if(isEmpty()){
        printf("Queue is empty\n");
        return;
    }
    
    for(int i = front ; i <= rear ; i++ ){
        printf(" %d ",arr[i]);
    }
    printf("\n");
}

void main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);
    enqueue(5);// must throw Queue is full
    display();
    dequeue();
    dequeue();
    dequeue();
    display();
    dequeue();
    dequeue();
    dequeue();// must throw Queue is empty
}

/*
Output : 

Queue is full !                                                                                                        
 1  2  3  4  5                                                                                                         
 4  5                                                                                                                  
Queue is empty !  

*/
