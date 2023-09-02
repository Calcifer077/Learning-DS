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

node *insertpos(node *head, int position, int data){//It will not insert element at the first position.
    node *n = new node(data);

    if(position == 1){
        n -> next = head;
        return n;
    }

    node *temp = head;
    for(int i = 1;i <= position-2 && temp != NULL; i++){
        temp = temp -> next;
    }
    if(temp == NULL){
        return head;
    }
    n -> next = temp -> next;
    temp -> next = n;
    return head;
}

void insertattail(node* &head, int val){
    node* n = new node(val);
    if(head == NULL){
        head = n;
        return;
    }
    node* temp = head;
    while(temp->next != NULL){
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
    insertattail(head, 1);
    insertattail(head, 12);
    insertattail(head, 3);
    
    display(head);
    cout<<"Enter the position at which you want to enter the new node:";
    int pos; cin>>pos;
    cout<<"Enter the element you want to enter: ";
    int num; cin>>num;
    insertpos(head, pos, num);
    display(head);
    return 0;
}
