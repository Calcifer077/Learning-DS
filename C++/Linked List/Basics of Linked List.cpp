//Traversing should be done in the linked list.
#include<iostream>
using namespace std;

class node{//node is the pointer that points to the next location.
	public:
	//A node is the basic structure of the linked list. It stores data as value than pointer.
	//The pointer points out the address of the next value.
	//Empty node can't be present in linked list.
		int data;//It is the value stored in the Linked list.
		node* next;
		
		node(int val){
			data = val;
			next = NULL;
		}
};
//The last pointer of a linked list is NULL.
//The first node is known as head.
void insertAthead(node* &head, int val){//It will add the value at the first position.
	node* n = new node(val);
	n->next = head;
	head = n;
}

void insertAttail(node* &head, int val){//It will add the value at the last position.
	node* n = new node(val)
	
	if(head == NULL){
		head = n;
		return;
	}
	node* temp = head;//Is the iterator in the case of Linked List.
	while(temp->next!=NULL){
		temp = temp->next;
	}
	temp->next = n;
}

void display(node* head){
	node* temp = head;
	while(temp != NULL){
		cout<<temp->data<<"->";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}
int main(){
	node* head = NULL;
	insertAttail(head, 1);
	insertAttail(head, 2);
	insertAttail(head, 3);
	display(head);
	insertAthead(head, 4);
	display(head);
	return 0;
}
