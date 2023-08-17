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

void display(node* head){
	node* temp = head;
	while(temp != NULL){
		cout<<temp->data<<"->";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}

bool search(node* head, int key){//This will return the bool value which means that if it is true it will return 1 and if not
				// it will return 0.
	node* temp = head;
	while(temp != NULL){
		if(temp -> data == key){
			return true;
		}
		temp = temp->next;
	}
	return false;
}

int main(){
	node* head = NULL;
	insertAttail(head, 1);
	insertAttail(head, 2);
	insertAttail(head, 3);
	display(head);
	insertAthead(head, 4);
	display(head);
	cout<<search(head, 5)<<endl;
	return 0;
}
