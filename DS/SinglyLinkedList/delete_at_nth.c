#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* HEAD;

void insert(int d){
struct Node* temp = ( struct Node* ) malloc(sizeof(struct Node)) ;
temp->data = d;
temp->next = HEAD;
HEAD = temp;

}
void display(){
    struct Node* temp = HEAD;
    printf("\nLinked List : ");
    while(temp!=NULL){
        printf(" %d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}
 void delete(int pos){
     struct Node* temp1 = HEAD;
     if(pos==1){
         HEAD = temp1->next;
         free(temp1);
     }else{
         for (int i = 0; i < pos - 2; i++) {
             temp1 = temp1->next;
         }
         //temp1 = n-1 th node
         struct Node* temp2 = temp1->next;// temp2 = n+1 th node
         temp1->next=temp2->next;
         free(temp2);
     }
 }
int main()
{

    insert(5);
    insert(4);
    insert(3);
    insert(2);
    insert(1);
    display();
    delete(5);
    display();
    delete(1);
    display();

    return 0;
}


