#include<iostream>
using namespace std;

class node{
	public:
		int data;
		node* next;
		
		node(int val){
			data = val;
			next = NULL;
		}
};

void InsertAtHead(node* &head, int val){
	node* n = new node(val);
	n->next = head;
	head = n;
}
void InsertAtTail(node* &head, int val){
	node* n = new node(val);
	
	if(head == NULL){
		head = n;
		return;
	}
	node* temp = head;
	while(temp->next!=NULL){
		temp = temp->next;
	}
	temp->next = n;
}

void display(node* head){
	node* temp = head;
	while(temp != NULL){
		cout<<temp->data<<"->";
		temp = temp->next;;
	}
	cout<<"NULL"<<endl;
}

void deleteAthead(node* &head){
	node* todelete = head;
	head = head->next;
	
	delete todelete;	
}

void deletion(node* &head, int val){
	if(head == NULL){//if there are no elements in the linked list.
		return;
	}
	if(head->next == NULL){//If there is only one element in linked list.
		deleteAthead(head);
		return;  
	}
	node* temp = head;
	while(temp->next->data != val){
		temp = temp->next;
	}
	node* todelete = temp->next;
	temp->next = temp->next->next;
	
	delete todelete;
}

int main(){
	node* head = NULL;
	InsertAtTail(head, 10);
	InsertAtTail(head, 12);
	InsertAtTail(head, 13);
	InsertAtTail(head, 14);
	InsertAtTail(head, 15);
	display(head);
	deletion(head, 12) ;
	display(head);
	return 0;
}
