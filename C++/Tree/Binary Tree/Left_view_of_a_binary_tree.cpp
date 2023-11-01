//It will print the left view of a binary tree.
#include<bits/stdc++.h>
using namespace std;

class Node{//Basic structure of a Node.
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

void leftview(Node* root){
    if(root == NULL){//If there are no roots in a tree.
        return;
    }
    
    queue<Node*> q;//Using queue for the implementation.
    q.push(root);
    
    while(!q.empty()){//Do it until the queue is not empty.
        int n = q.size();
        
        for(int i = 1; i <= n; i++){
            Node* temp = q.front();
            q.pop();

            //if the element is in the first place meaning that it is at the most left position.
            if(i == 1){
                cout<<temp->data<<" ";
            }
            if(temp->left != NULL){//If left subtree exists.
                q.push(temp->left);
            }
            if(temp->right != NULL){//If right subtree exists.
                q.push(temp->right);
            }
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
    root->right->right = new Node(7);
    
    leftview(root);
    return 0;
}
