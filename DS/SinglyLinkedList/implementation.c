#include <stdlib.h>
#include <stdio.h>

struct Node{
        int data;
        struct Node* next;
        }Node;

struct Node* HEAD;

void display(){
        struct Node* temp = HEAD;
        printf("Linked List : ");
        // print until next of Node != NULL
        while(temp!=NULL){
                printf(" %d ",temp->data);
                temp = temp->next;
                }
                printf("\n");

        }


int main()
{
    struct Node* node1 = ( struct Node* ) malloc(sizeof(struct Node)) ;
        struct Node* node2 = ( struct Node* ) malloc(sizeof(struct Node)) ;
        struct Node* node3 = ( struct Node* ) malloc(sizeof(struct Node)) ;
        struct Node* node4 = ( struct Node* ) malloc(sizeof(struct Node)) ;
        struct Node* node5 = ( struct Node* ) malloc(sizeof(struct Node)) ;

        HEAD = node1;

        node1->data = 1;
        node1->next = node2;

        node2->data = 2;
        node2->next = node3;

        node3->data = 3;
        node3->next = node4;

        node4->data = 4;
        node4->next = node5;

        node5->data = 5;
        node5->next = NULL;

                display();
        return 0;
}

/*
Output :

Linked List :  1  2  3  4  5

*/


