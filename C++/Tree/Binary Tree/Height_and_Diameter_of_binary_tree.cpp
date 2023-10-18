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

int calcHeight(Node* root){
    if(root == NULL){
        return 0;
    }
    int lheight = calcHeight(root->left);
    int rheight = calcHeight(root->right);
    
    return max(lheight, rheight) + 1;
}

int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    cout<<calcHeight(root);
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
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

int calcHeight(Node* root){//O(N)
    if(root == NULL){
        return 0;
    }
    int lheight = calcHeight(root->left);
    int rheight = calcHeight(root->right);
    
    return max(lheight, rheight) + 1;
}

int calcdiameter(Node* root){//O(n^2)
    if(root == NULL){
        return 0;
    }
    int lheight = calcHeight(root->left);
    int rheight = calcHeight(root->right);
    
    int currdiameter = lheight + rheight + 1;
    
    int ldiameter = calcdiameter(root->left);
    int rdiameter = calcdiameter(root->right);
    
    return max(currdiameter, max(ldiameter, rdiameter));
}

int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    cout<<calcdiameter(root);
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
........................OPTIMIZD WAY OF CALCULATING DIAMETER.............................
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

int calcdiameter(Node* root, int* height){//O(n)
    if(root == NULL){
        *height = 0;
        return 0;
    }
    int lh = 0, rh = 0;
    int ldiameter = calcdiameter(root->left, &lh);
    int rdiameter = calcdiameter(root->right, &rh);
    
    int currdiameter = lh + rh + 1;
    *height = max(lh, rh) + 1;
    
    return max(currdiameter, max(ldiameter, rdiameter));
}
int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    
    int height = 0;
    cout<<calcdiameter(root, &height);
    return 0;
}
