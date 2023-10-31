//Balanced Height tree --> For each node, the difference between the heights of the left subtree and right subtree should be leass than or equal to 1.
//    |left subtree height - right subtree height| <= 1.
//These two ways will use bottom-up approach meaning thay will go to the leaf node and come up eith the result.

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

int height(Node* root){//O(n)
    if(root == NULL){
        return 0;
    }
    int lheight = height(root->left);
    int rheight = height(root->right);
    
    return max(lheight, rheight) + 1;
}
//As these function will go to each node, the time complexity will be O(n). The height function will also go to each node so the time 
//complexitty will also be O(n). Total time complexity will be O(n^2).
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
.........................................................................................
.........................................................................................
.........................................................................................
.................OPTIMIZED WAY OF CHECKING IF A TREE IS BALANCED OR NOT..................
//O(n) n---> number of nodes.
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

bool balancedtree(Node* root, int* height){//Will return a boolean value, will take arguments as root and height.
    if(root == NULL){//If there are no roots meaning that the tree is empty.
        return true;
    }
    int lh = 0, rh = 0;//Intializing left and right height of subtree.
    if(balancedtree(root->left, &lh) == false){//Checking for left subtree.
        return false;
    }
    if(balancedtree(root->right, &rh) == false){//Checking for right subtree.
        return false;
    }
    *height = max(lh, rh) + 1;//To calculate the height of a tree we take the 'max' of height of its Left subtree and right subtree.
                              //And add 1 to it.
                              //If we were to start from the bottom most node, its height will 1 becuase it doesn't have any leaf nodes,
                              //so we will just add a '1' for itself.
    if(abs(lh - rh) <= 1){//Take the absolute value meaning only positive value.
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
    
    int height = 0;
    
    if(balancedtree(root, &height)){
        cout<<"balancedtree";
    }
    else{
        cout<<"Not balancedtree";
    }
    
    if(balancedtree(root1, &height)){
        cout<<"balancedtree";
    }
    else{
        cout<<"Not balancedtree";
    }
    return 0;
}
