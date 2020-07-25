#include <stdlib.h>
#include <stdio.h>

struct Node{
        int data;
        struct Node* next;
        }Node;

struct Node* HEAD;

void insertAtTheBeginning(int d){
        // The node gets inserted at the beginning
        struct Node* temp = ( struct Node* ) malloc(sizeof(struct Node)) ;
        temp->data = d;
        // temp becomes the HEAD node.
        temp->next = HEAD;
        // HEAD becomes the next of temp node.
        HEAD = temp;

        }

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
        int l = 0, n = 0;
        HEAD = NULL ;
        printf("Enter no of nodes : ");
        scanf("%d",&l);
        for(int i = 0; i<l ; i++){
                printf("Enter node %d : ",i+1);
                scanf("%d",&n);
                insertAtTheBeginning(n);
                }
                display();
        return 0;
}

/*
Output :

Enter no of nodes : 7
Enter node 1 : 7
Enter node 2 : 6
Enter node 3 : 5
Enter node 4 : 4
Enter node 5 : 3
Enter node 6 : 2
Enter node 7 : 1
Linked List :  1  2  3  4  5  6  7

*/


