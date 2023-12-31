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
		nextptr = currptr->next;//Store the next node in the nextptr.
		currptr->next = prevptr;//reverse the current node's next pointer.
		
		//Move prevptr and currptr one step forward.
		prevptr = currptr;
		currptr = nextptr;
	}
	//When the loop finishes currptr will be pointing to NULL and prevptr will be pointing to the new head.
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
.........................................................................................
.........................................................................................
.........................................................................................
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

node* reverseRecursive(node* &head){
	if(head == NULL || head->next == NULL){
		return head;
	}
	node* newhead = reverseRecursive(head -> next);
	head->next->next = head;
	head->next = NULL;
	
	return newhead;
}
int main(){
	node* head = NULL;
	insertAttail(head, 1);
	insertAttail(head, 2);
	insertAttail(head, 3);
	display(head);
	insertAthead(head, 4);
	display(head);
	node* newhead = reverseRecursive(head);
	display(newhead); 
	return 0;
}
