#include <stdlib.h>
#include <stdio.h>

struct Node{
        int data;
        struct Node* next;
        }Node;

struct Node* HEAD;

void insertAtTheTail(int d){
        // The node gets inserted at the Tail
        struct Node* temp1 = ( struct Node* ) malloc(sizeof(struct Node)) ;
        struct Node* temp2 = HEAD ;

        temp1->data = d;
        temp1->next = NULL;
        
        if(HEAD == NULL){
            HEAD = temp1;
            return;
        }
        
        while(temp2->next!=NULL){
            temp2 = temp2->next;
        }
        
        temp2->next = temp1;

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
                insertAtTheTail(n);
                }
                display();
        return 0;
}

/*
Output:

Enter no of nodes : 5                                                                                                  
Enter node 1 : 1                                                                                                       
Enter node 2 : 2                                                                                                       
Enter node 3 : 3                                                                                                       
Enter node 4 : 4                                                                                                       
Enter node 5 : 5   
Linked List :  1  2  3  4  5                                                                                           
*/
