#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
};

class LinkedList {
private:
    Node* head;
    int size;

public:
    LinkedList() : head(nullptr), size(0) {}

    void addNode(int data) {
        Node* newNode = new Node();
        newNode->data = data;
        newNode->next = head;
        head = newNode;
        size++;
    }

    int getSize() {
        return size;
    }

    void printList() {
        Node* temp = head;
        while (temp != nullptr) {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
    
    void getMiddleElement(){
        Node* temp = head;
        int counter = 0;
        while(temp != nullptr && counter < getSize()/2){
            temp = temp->next;
            counter++;
        }
        cout<<temp->data;
    }
};

int main() {
    LinkedList list;
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.printList();
    list.getMiddleElement();
    return 0;
}
