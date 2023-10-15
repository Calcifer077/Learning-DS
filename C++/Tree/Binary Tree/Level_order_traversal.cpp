#include<bits/stdc++.h>
using namespace std;

class Node{
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

void printlevelorder(Node* root){
    if(root == NULL){
        return;
    }
    
    queue<Node*> q;
    q.push(root);
    q.push(NULL);
    
    while(!q.empty()){
        Node * newroot = q.front();
        q.pop();
        if(newroot != NULL){
            cout<<newroot->data<<" ";
            if(newroot->left){
                q.push(newroot->left);
            }
            if(newroot->right){
                q.push(newroot->right);
            }
        }
        else if(!q.empty()){
            q.push(NULL);
        }
    }
}

int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->left = new Node(7);
    
    printlevelorder(root);
    return 0;
}
