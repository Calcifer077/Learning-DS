#include<bits/stdc++.h>
using namespace std;

class Node{//Creating a basic structure of a node.
    public:
        int data;//Will store the data in a node
        Node* left;//Wil go to the left child.
        Node* right;//Will go to the right child.
        
        Node(int val){//Constructor
            data = val;
            left = NULL;
            right = NULL;
        }
};

int main(){
    class Node* root = new Node(1);//Creating a node.
    root->left = new Node(2);//Creating a child of root which will be at left position of the root with value of 2.
    root->right = new Node(3);//Creating a child of root which will be at right position of the root with value of 3.
    
    /* 
            1
           / \
          2   3
    */
    
    root->left->left = new Node(4);//Creating a child on left of 2.
    root->left->right = new Node(5);//Creating a child on right of 2.
    /* 
            1
           / \
          2   3
         / \
        4   5
    */
    return 0;
}
