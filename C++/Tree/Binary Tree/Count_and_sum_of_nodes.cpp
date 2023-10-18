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

int countnodes(Node* root){//Used to count total number of nodes.
    if(root == NULL){//Base case (The tree is empty)
        return 0;
    }
    return countnodes(root->left) + countnodes(root->right) + 1;
}

int sumnodes(Node* root){//Used to sum all the nodes. 
    if(root == NULL){//Base case
        return 0;
    }
    return sumnodes(root->left) + sumnodes(root->right) + root->data;
}
int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    cout<<countnodes(root)<<endl;
    cout<<sumnodes(root)<<endl;
    return 0;
}
