//we will be using queue for the implementation of this program.
//Insert a root in the queue. Add a 'NULL' at the end of each level.
//Pop queue and process(add its left and right subtree) it.
#include<bits/stdc++.h>
using namespace std;

class Node{//Basic structure of a node in a tree.
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

void printlevelorder(Node* root){//Function to print levelorder.
    if(root == NULL){
        return;
    }
    
    queue<Node*> q;//Using queue to implement this function.
    q.push(root);//Pushing the root in the queue.
    q.push(NULL);//Marks the end of level 0.
    
    while(!q.empty()){
        Node * newroot = q.front();
        q.pop();
        if(newroot != NULL){
            cout<<newroot->data<<" ";//If it is not a 'NULL' ptr, print it.
            if(newroot->left){
                q.push(newroot->left);
            }
            if(newroot->right){
                q.push(newroot->right);
            }
        }
        else if(!q.empty()){//Marks the end of a level.
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
