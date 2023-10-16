#include<bits/stdc++.h>
using namespace std;

class Node{//Basic structure of a node.
    public:
    int data;
    Node* left; 
    Node* right;
    
    Node(int val){
        data = val;
        left = NULL;
        right = NULL;
    }
}; 

int sumatk(Node* root, int k){
    if(root == NULL){//If no node exist.
        return -1;
    }
    queue<Node*> q;//Creating a queue for implementation.
    q.push(root);
    q.push(NULL);//Marking the end of a level.
    
    int level = 0;
    int sum = 0;
    
    while(!q.empty()){//Jab tak queue empty nahi hai.|| Do it until the queue is not empty.
        Node* temp = q.front();//Creating a 'temp' for holding front of the queue.
        q.pop();
        
        if(temp != NULL){//If temp is not equal to 'NULL'.
            if(level ==  k){
                sum += temp->data;
            }
            if(temp->left){
                q.push(temp->left);
            }
            if(temp->right){
                q.push(temp->right);
            }
        }
        
        else if(!q.empty()){
            q.push(NULL);
            level++;
        }
    }
    return sum;
}
int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    cout<<sumatk(root, 2);
    return 0;
}
