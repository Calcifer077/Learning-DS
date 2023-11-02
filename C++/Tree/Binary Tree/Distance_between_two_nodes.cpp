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
//LCA ---> Lowest common ancestor.
Node* LCA(Node* root, int n1,int n2){
    if(root == NULL){//If there are no roots in the tree.
        return NULL;
    }
    if(root->data == n1 || root->data == n2){//If any one of the data is contained in the root that will mean that the root is the LCA.
        return root;
    }
    //If the above cases are not true.
    Node* left = LCA(root->left, n1, n2);//Search for LCA in the left subtree.
    Node* right = LCA(root->right, n1, n2);//Search for LCA in the right subtree.
    
    if(left != NULL && right != NULL){//If both left and right are not NULL. It will mean that 'n1' and 'n2' were found in different subtree.
                                      //This will mean that the current node is the LCA.
        return root;
    }
    if(left == NULL && right == NULL){//If both left and right comes out to be NULL, meaning that 'n1', 'n2' were not found in the tree.
                                      //It will return NULL.
        return NULL;
    }
    //If 'n1' or 'n2 were found in a single tree.
    if(left != NULL){//If one o them was found in a single subtree. Continue the search in the same tree.
        return LCA(root->left, n1, n2);
    }
    return LCA(root->right, n1, n2);//This is if 'n1', 'n2' was found in the right subtree.
}

int finddist(Node* root, int k, int dist){
    if(root == NULL){//It means that the node to be found was not in the tree.
        return -1;
    }
    if(root->data == k){
        return dist;
    }
    int left = finddist(root->left, k, dist+1);//Searching in the left subtree.
    if(left != -1){//If it is found in the left subtree.
        return left;
    }
    //else search in the right subtree.
    return finddist(root->right, k, dist+1);
    
}
int distancebwnodes(Node* root, int n1, int n2){
    Node* lca = LCA(root, n1, n2);//First calculate the LCA.
    
    int d1 = finddist(lca, n1, 0);//Finding distance of 'n1' from LCA.
    int d2 = finddist(lca, n2, 0);//Finding distance of 'n2' from LCA.
    
    return d1+d2;//returning the final result which will be the sum of the two distances.
}

int main(){
    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    
    root->left->left = new Node(4);
    root->right->right = new Node(5);
    
    cout<<distancebwnodes(root, 4, 5);
    return 0;
}
