//This algorithm is also known as Floyd's algoithm and Tortoise and hare method.
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
