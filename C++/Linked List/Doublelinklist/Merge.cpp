//Time complexity = O(m*n);
//Merging two linked list and sorting them.

//Iterative method.
#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node* prev;
    
    node(int val){
        data = val;
        next = NULL;
        prev = NULL;
    }
};

void insertathead(node* &head, int val){
    node* n = new node(val);
    n->next = head;
    if(head != NULL){
        head->prev = n;
    }
    head = n;
}
void insertattail(node* &head, int val){
    if(head == NULL){
        insertathead(head, val);
        return;
    }
    node* n = new node(val);
    
    node* temp = head;
    
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
    n->prev = temp;
}

void display(node* head){
    node* temp = head;
    while(temp != NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

node* merge(node* &head1, node* &head2){
    //Declaring two pointers.
    node* p1 = head1;//Points to the head of first list.
    node* p2 = head2;//Points to the head of second list.
    node* dummynode = new node(-1);
    node* p3 = dummynode;//Points to the resultant linked list.
    
    while(p1 != NULL && p2 != NULL){
        if(p1->data < p2->data){
            p3->next = p1;//Adding data to the next.
            p1 = p1->next;
        }
        else{
            p3->next = p2;
            p2 = p2->next;
        }
        p3 = p3->next;//Iterating p3.
    }
    
    while(p1 != NULL){
        p3->next = p1;
        p1 = p1->next;
        p3 = p3->next;
    }
    while(p2 != NULL){
        p3->next = p2;
        p2 = p2->next;
        p3 = p3->next;
    }
    
    return dummynode->next;//Doing next because the first value is -1 declared above.
}
int main(){
    node* head1 = NULL;
    node* head2 = NULL;
    
    int arr1[] = {1,4,5,7};
    int arr2[] = {2,3,6,8};
    for(int i = 0; i < 4; i++){
        insertattail(head1, arr1[i]);
    }
    for(int i = 0; i < 4; i++){
        insertattail(head2, arr2[i]);
    }
    display(head1);
    display(head2);
    
    node* head3 = merge(head1, head2);
    display(head3);
    

    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
//Recursive method.
#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node* prev;
    
    node(int val){
        data = val;
        next = NULL;
        prev = NULL;
    }
};

void insertathead(node* &head, int val){
    node* n = new node(val);
    n->next = head;
    if(head != NULL){
        head->prev = n;
    }
    head = n;
}
void insertattail(node* &head, int val){
    if(head == NULL){
        insertathead(head, val);
        return;
    }
    node* n = new node(val);
    
    node* temp = head;
    
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
    n->prev = temp;
}

void display(node* head){
    node* temp = head;
    while(temp != NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

node* merge(node* &head1, node* &head2){
    if(head1 == NULL){//If the first linked list is empty it will simply return the second list in the answer.
        return head2;
    }
    if(head2 == NULL){//If the second linked list is empty it will simply return the first list in the answer.
        return head1;
    }
    node* result;//Declaring a result pointer.
    if(head1->data < head2->data){//If data of head1 is less than the data of head2 we will give the node to result.
        result = head1;
        result->next = merge(head1->next, head2);//Calling the merge function again.
    }
    else{
        result = head2;
        result->next = merge(head1, head2->next);
    }
    
    return result;
}
int main(){
    node* head1 = NULL;
    node* head2 = NULL;
    
    int arr1[] = {1,4,5,7};
    int arr2[] = {2,3,6,8};
    for(int i = 0; i < 4; i++){
        insertattail(head1, arr1[i]);
    }
    for(int i = 0; i < 4; i++){
        insertattail(head2, arr2[i]);
    }
    display(head1);
    display(head2);
    
    node* head3 = merge(head1, head2);
    display(head3);
    

    return 0;
}
