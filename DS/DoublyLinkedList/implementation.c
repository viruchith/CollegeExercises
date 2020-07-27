// cc - mycodeschool 
// website - http://mycodeschool.com/
/* Doubly Linked List implementation */
#include<stdio.h>
#include<stdlib.h>

struct Node  {
	int data;
	struct Node* next;
	struct Node* prev;
};

struct Node* head; // global variable - pointer to head node.

//Creates a new Node and returns pointer to it. 
struct Node* GetNewNode(int x) {
	struct Node* newNode
		= (struct Node*)malloc(sizeof(struct Node));
	newNode->data = x;
	newNode->prev = NULL;
	newNode->next = NULL;
	return newNode;
}

//Inserts a Node at head of doubly linked list
void InsertAtHead(int x) {
	struct Node* newNode = GetNewNode(x);
	if(head == NULL) {
		head = newNode;
		return;
	}
	head->prev = newNode;
	newNode->next = head; 
	head = newNode;
}

//Inserts a Node at tail of Doubly linked list
void InsertAtTail(int x) {
	struct Node* temp = head;
	struct Node* newNode = GetNewNode(x);
	if(head == NULL) {
		head = newNode;
		return;
	}
	while(temp->next != NULL) temp = temp->next; // Go To last Node
	temp->next = newNode;
	newNode->prev = temp;
}

void insertAtNth(int pos , int data){
    struct Node* temp1 = head;
    struct Node* temp2 = GetNewNode(data); // node to be inserted 
    for(int i=0;i<pos-1;i++){
        temp1 = temp1->next;
    }// temp1 = nth node ( node to be right shifted)
    
    temp2->prev = temp1->prev;// new node->prev = existing node -> prev 
    temp2->next = temp1;// new node->next = existing node
    temp1->prev->next = temp2;// next of previous node of existing node = new node
    temp1->prev = temp2;// previous node of existing node = new node
}

// to delete the first node in the list
void deleteAtBeginning(){
    struct Node* temp = head;
    head = head->next;
    head->prev = NULL;
    free(temp);
}

void deleteAtEnd(){
    struct Node* temp1 =head;
    while(temp1->next!=NULL){
        temp1= temp1->next;
    }
    struct Node* temp2 = temp1->prev;
    temp2->next = NULL;
    free(temp1);
    
}

void deleteAfterNth(int n){
    
    struct Node* temp1 = head;
    struct Node* temp2 = GetNewNode(0) ;//(struct Node*)malloc(sizeof(struct Node));
    struct Node* temp3 = GetNewNode(0) ;//(struct Node*)malloc(sizeof(struct Node));
    for(int i=0;i<n-1;i++){
        temp1 = temp1->next;
    } //  temp1 = nth node
    if(temp1->next == NULL){
        printf("No node after last node ! \n");
        return;
    }else if(temp1->next->next==NULL){ // if node to be deleted is last node
        temp2 = temp1->next; // temp2 = node to be deleted ( n+1 th node )
        temp1->next = NULL;// n th node of next-> null ( it becomes the last node )
        free(temp2);// delete last node ( nth node )
        return;
    }
        //printf("\nTemp1->data = %d",temp1->data);
        temp2 = temp1->next;// temp2 = node to be deleted (n+1 th node)
        temp1->next = temp2->next; // head->next = n+2th node
        temp3 = temp1->next; // n+2th node
        temp3->prev = temp1;// n+2th node->prev = nth node
        free(temp2);
        
    
    
}

//Prints all the elements in linked list in forward traversal order
void Print() {
	struct Node* temp = head;
	printf("Forward: ");
	while(temp != NULL) {
		printf("%d ",temp->data);
		temp = temp->next;
	}
	printf("\n");
}

//Prints all elements in linked list in reverse traversal order. 
void ReversePrint() {
	struct Node* temp = head;
	if(temp == NULL) return; // empty list, exit
	// Going to last Node
	while(temp->next != NULL) {
		temp = temp->next;
	}
	// Traversing backward using prev pointer
	printf("Reverse: ");
	while(temp != NULL) {
		printf("%d ",temp->data);
		temp = temp->prev;
	}
	printf("\n");
}


int main() {

	/*Driver code to test the implementation*/
	head = NULL; // empty list. set head as NULL. 
	
	// Calling an Insert and printing list both in forward as well as reverse direction. 
	InsertAtTail(2); Print();  ReversePrint();
	InsertAtTail(4); Print(); ReversePrint();
	InsertAtHead(6); Print(); ReversePrint();
	InsertAtTail(8); Print(); ReversePrint();
	printf("\nAfter Deletion : \n");
	deleteAtBeginning();Print();ReversePrint();
	printf("\nAfter Insertion : \n");
	insertAtNth(2,7);Print();ReversePrint();
	printf("\nAfter Deletion : \n");
	deleteAtEnd();   Print();  ReversePrint();
	printf("\nAfter Insertion : \n");
	InsertAtHead(1);Print();  ReversePrint();
	printf("\nAfter Deletion : \n");
	deleteAfterNth(1);Print();  ReversePrint();


}

/*
Output : 
Forward: 2                                                                                                              
Reverse: 2                                                                                                              
Forward: 2 4                                                                                                            
Reverse: 4 2                                                                                                            
Forward: 6 2 4                                                                                                          
Reverse: 4 2 6                                                                                                          
Forward: 6 2 4 8                                                                                                        
Reverse: 8 4 2 6                                                                                                        
                                                                                                                        
After Deletion :                                                                                                        
Forward: 2 4 8                                                                                                          
Reverse: 8 4 2  	

After Insertion :                                                                                                       
Forward: 2 7 4 8                                                                                                        
Reverse: 8 4 7 2 
                                                                                                                        
After Deletion :                                                                                                        
Forward: 2 7 4                                                                                                          
Reverse: 4 7 2 
                                                                                                                       
After Insertion :                                                                                                       
Forward: 1 2 7 4                                                                                                        
Reverse: 4 7 2 1 
                                                                                                                       
After Deletion :                                                                                                        
Forward: 1 7 4                                                                                                          
Reverse: 4 7 1                                                                                                          
             


*/
