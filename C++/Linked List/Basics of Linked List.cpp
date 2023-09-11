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
	node* n = new node(val);
	
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

void makecycle(node* &head, int pos){
    node* temp = head;
    node* startnode;
    
    int count = 1;
    while(temp->next != NULL){
        if(count == pos){
            startnode = temp;
        }
        
        temp = temp->next;
        count++;
    }
    
    temp->next = startnode;
}

bool detectcycle(node* &head){
    node* slow = head;
    node* fast = head;
    
    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
        
        if(fast == slow){
            return true;
        }
    }
    return false;
    
}

void removecycle(node* &head){
    node* slow = head;
    node* fast = head;
    
    do{
        slow = slow->next;
        fast = fast->next->next;
    }while(slow!=fast);
    
    fast = head;
    while(slow->next != fast->next){
        slow = slow->next;
        fast = fast->next;
    }
    
    slow->next = NULL;
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
	insertAttail(head, 4);
	insertAttail(head, 5);
	insertAttail(head, 6);
	insertAttail(head, 7);
	makecycle(head, 4);
	
	int index = detectcycle(head);
	if(index == 1){
	    cout<<"There is a cycle in the loop! ";
	}
	else{
	    cout<<"There is not a cycle in the loop! ";
	}
	
	removecycle(head);
	
	int inde = detectcycle(head);
	if(inde == 1){
	    cout<<"There is a cycle in the loop! ";
	}
	else{
	    cout<<"There is not a cycle in the loop! ";
	}
	return 0;
}
