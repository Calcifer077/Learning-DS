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

int height(Node* root){
    if(root == NULL){
        return 0;
    }
    int lheight = height(root->left);
    int rheight = height(root->right);
    
    return max(lheight, rheight) + 1;
}
bool balancedtree(Node* root){
    if(root == NULL){
        return true;
    }
    if(balancedtree(root->left) == false){
        return false;
    }
    if(balancedtree(root->right) == false){
        return false;
    }
    int lh = height(root->left);
    int rh = height(root->right);
    
    if(abs(lh - rh) <= 1){
        return true;
    }
    else{
        return false;
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

    Node* root1 = new Node(1);
    root1->left = new Node(2);
    root1->left->left = new Node(3);
    if(balancedtree(root)){
        cout<<"balancedtree";
    }
    else{
        cout<<"Not balancedtree";
    }
    
    if(balancedtree(root1)){
        cout<<"balancedtree";
    }
    else{
        cout<<"Not balancedtree";
    }
    return 0;
}
