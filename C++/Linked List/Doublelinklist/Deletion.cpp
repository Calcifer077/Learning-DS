#include<iostream>
using namespace std;

class doublelinklist{
    public:
    int data;
    doublelinklist* next;
    doublelinklist* prev;
    
    doublelinklist(int val){
        data = val;
        next = NULL;
        prev = NULL;
    }
};

void insertathead(doublelinklist* &head, int val){
    doublelinklist* n = new doublelinklist(val);
    n->next = head;
    if(head != NULL){
        head->prev = n;
    }
    
    head = n;
}
void insertattail(doublelinklist* &head, int val){
    
    if(head == NULL){
        insertathead(head, val);
        return;
    }
    doublelinklist* n = new doublelinklist(val);
    
    doublelinklist* temp = head;
    
    while(temp->next != NULL){
        temp = temp->next;
    }
    
    temp->next = n;
    n->prev = temp;
}

void deleteathead(doublelinklist* &head){
    doublelinklist* todelete = head;
    head = head->next;
    head->prev = NULL;
    
    delete todelete;
}

void deletion(doublelinklist* &head, int pos){
    if(pos == 1){
        deleteathead(head);
        return;
    }
    doublelinklist* temp = head;
    int count = 0;
    
    while(temp != NULL && count != pos){
        temp = temp->next;
        count++;
    }
    
    temp->prev->next = temp->next;
    if(temp->next != NULL){
        temp->next->prev = temp->prev;    
    }
    
    delete temp;
}

void display(doublelinklist* head){
    doublelinklist* temp = head;
    while(temp != NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}
int main(){
    doublelinklist* head = NULL;
    insertattail(head, 1);
    insertattail(head, 2);
    insertattail(head, 3);
    insertattail(head, 4);
    insertattail(head, 5);
    display(head);
    insertathead(head, 8);
    display(head);
    
    deletion(head, 5);
    display(head);
    return 0;
}
