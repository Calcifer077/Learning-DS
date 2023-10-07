/*
Types of Traversal :->
             1
          /    \
         2      3   
        / \    / \
       4   5  6   7
1. Preorder Traversal ->    Root ---> Left Subtree(Can't go any left) ---> Right Subtree
    Ans: 1,2,4,5,3,6,7
2. Inorder Traversal -> Left Subtree ---> Root ---> Right Subtree
    Ans: 4,2,5,1,6,3,7
3. Postorder Traversal -> Left Subtree ---> Right subtree ---> Root
    Ans: 4,5,2,6,7,3,1
*/
#include<iostream>
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

void preorder(Node* root){
    if(root == NULL){
        return;
    }
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}

void inorder(Node* root){
    if(root == NULL){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

void postorder(Node* root){
    if(root == NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}

int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    //preorder(root); 
    //inorder(root);
    postorder(root);
    return 0;
}
