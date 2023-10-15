//In case of building a tree from preorder and inorder we will start from the first.
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

int search(int inorder[], int start, int end, int curr){//Will return the position of the curr pointer which will
                                                        // be the next node to be inserted in the tree.
    for(int i = start; i <= end; i++){
        if(inorder[i] == curr){
            return i;
        }
    }
    return -1;
}

Node* buildtree(int preorder[], int inorder[], int start, int end){
    static int idx = 0;//static means only one index will created in the entire progam.
    
    if(start > end){
        return NULL;
    }
    int curr = preorder[idx];
    idx++;
    Node* node = new Node(curr);
    if(start == end){//If there is only one element in the tree.
        return node;
    }
    int pos = search(inorder, start, end, curr);//Searching for the position of the node to be inserted in the tree.
    node->left = buildtree(preorder, inorder, start, pos-1);//Builds the left tree.
    node->right = buildtree(preorder, inorder, pos+1, end);//Builds the right tree.
    
    return node;//will print the final result.
}

void inorderprint(Node* root){//To check whether the tree we have constructed is correct or not.
    if(root == NULL){
        return;
    }
    inorderprint(root->left);
    cout<<root->data<<" ";
    inorderprint(root->right);
}
int main(){
    int preorder[] = {1,2,4,3,5};
    int inorder[] = {4,2,1,5,3};
    
    Node* root = buildtree(preorder, inorder, 0, 4);
    inorderprint(root);
    return 0;
}
