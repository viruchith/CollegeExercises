/*
 * insertAtNthPosition.c
 *
 * Copyright 2020 Ganesan Koundappan <ganesankoundappan@viruchith.local>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


#include <stdlib.h>
#include <stdio.h>

struct Node{
        int data;
        struct Node* next;
        }Node;

struct Node* HEAD;

void insertAtNthPos(int d , int pos){
    struct Node* temp1 = (struct Node*) malloc(sizeof(struct Node*));
    temp1->data = d;
    temp1->next = NULL;
    if(pos==1){
        temp1->next = HEAD;
        HEAD = temp1;
        return; // exit out of the function
    }

    struct Node* temp2 = (struct Node*) malloc(sizeof(struct Node*));
    temp2 = HEAD;
    for(int i = 0; i<pos-2 ; i++){
        temp2 = temp2->next;
    }

    temp1->next = temp2->next;
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
    int n = 0,d=0,pos=0;

    HEAD  = NULL ;

        /*insertAtNthPos(1,1);
        insertAtNthPos(3,2);
        insertAtNthPos(4,3);
        insertAtNthPos(2,2);
        insertAtNthPos(5,5);*/

    printf("Enter no of nodes : ");
    scanf("%d",&n);

    for(int i=0 ; i<n;i++){
        printf("Enter node [ data <space> pos ] : ");
        scanf("%d %d",&d,&pos);
        insertAtNthPos(d,pos);
    }
        display();
        return 0;
}

/*
Output 1 :

Linked List :  1  2  3  4  5

*/


/*
Output 2 :

Enter no of nodes : 5
Enter node [ data <space> pos ] : 1 1
Enter node [ data <space> pos ] : 3 2
Enter node [ data <space> pos ] : 4 3
Enter node [ data <space> pos ] : 2 2
Enter node [ data <space> pos ] : 5 5
Linked List :  1  2  3  4  5


*/








