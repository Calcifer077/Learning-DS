//It will the right view of a binary tree.
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

void rightview(Node* root){
    if(root == NULL){//If there are no roots in a tree.
        return;
    }
    queue<Node*> q;//Using queue for the implementation.
    q.push(root);

    //The logic is to print the node which will be at the atmost right on its level.
    //The root will be printed because it exists alone on its level and it will be also true it there exists only a single node in the tree.
    while(!q.empty()){//Do it until the queue is not empty.
        int n = q.size();

        //Imagine that a level is stored in an array, the leftmost element will be stored at the last position.
        for(int i = 0; i < n; i++){
            Node* curr = q.front();
            q.pop();
            //Here n-1 is used because we started 'for' loop from 0 and run till 'i' is less than last position.
            if(i == n-1){//This will implement the logic.
                cout<<curr->data<<" ";
            }
            if(curr->left != NULL){//If left subtree of the tree exists.
                q.push(curr->left);
            }
            if(curr->right != NULL){//If right subtree of the tree exists.
                q.push(curr->right);
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
    
    rightview(root);
    return 0;
}
