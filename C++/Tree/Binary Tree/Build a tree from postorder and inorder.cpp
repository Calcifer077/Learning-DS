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

int search(int inorder[], int start, int end, int curr){
    for(int i = start; i<=end; i++){
        if(inorder[i] == curr){
            return i;
            break;
        }
    }
    return -1;
}
Node* buildtree(int postorder[], int inorder[], int start, int end){
    static int idx = end;
    if(start > end){
        return NULL;
    }
    int curr = postorder[idx];
    idx--;
    
    Node* root = new Node(curr);
    
    if(start == end){//left and right not left.
        return root;
    }
    
    int pos = search(inorder, start, end, curr);
    root->right = buildtree(postorder, inorder, pos+1, end);
    root->left = buildtree(postorder, inorder, start, pos-1);
    
    return root;
}

void inorderprint(Node* root){
    if(root == NULL){
        return;
    }
    inorderprint(root->left);
    cout<<root->data<<" ";
    inorderprint(root->right);
}
int main(){
    int postorder[] = {4,2,5,3,1};
    int inorder[] = {4,2,1,5,3};
    Node* root = buildtree(postorder, inorder, 0, 4);
    
    inorderprint(root);
    
    return 0;
}
