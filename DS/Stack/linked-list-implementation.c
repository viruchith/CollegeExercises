
#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
}Node;

struct Node* top = NULL;

int isEmpty(){
    if(top == NULL){
        return 1;
    }else{
        return 0;
    }
}

void push(int data){ // aka insert at the beginning
    struct Node* temp = ( struct Node* ) malloc(sizeof(struct Node)) ;
    temp->data = data;
    temp->next = top;
    top = temp;
}

void pop(){
    if(isEmpty()){
        printf("Stack underflow !\n");
        return;
    }
    struct Node* temp = top;
    top = top->next;
    free(temp);
}

void peek(){
    printf(" %d \n",top->data);
}


void display(){
    struct Node* temp = top;
    while(temp != NULL){
        printf(" %d ",temp->data);
        temp = temp->next ;
    }
    
    printf("\n");
}

int main()
{
    pop(); // underflow
    push(5);
    push(4);
    push(3);
    push(2);
    push(1);
    display();
    pop();
    display();
    return 0;
}


/*
Output : 

Stack underflow !                                                                                                      
1  2  3  4  5                                                                                                         
2  3  4  5 
 
 
*/
