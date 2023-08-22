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

void insertAthead(node* &head, int val){
	node* n = new node(val);
	n->next = head;
	head = n;
}

void insertAttail(node* &head, int val){
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

node* reverse(node* &head){
	node* prevptr = NULL;
	node* currptr = head;
	node* nextptr;
	
	while(currptr != NULL)	{
		nextptr = currptr->next;
		currptr->next = prevptr;
		
		prevptr = currptr;
		currptr = nextptr;
	}
	return prevptr;//new head.
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
	node* newhead = reverse(head);
	display(newhead); 
	return 0;
}
