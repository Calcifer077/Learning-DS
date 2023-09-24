//.................Implementation using array................
#include<iostream>
using namespace std;

#define n 20//size of array
class Queue{
    int *arr;// array for implementation
    //creating to pointers
    int front;//this will point to the first element of the array or the queue.
    int back;//It will point to the last element of the queue.
    
    public:
    Queue(){
        arr = new int[n];
        //while initializing do it with -1.
        front = -1;
        back = -1;
    }
    
    void push(int x){//given a element to push into the queue.
        if(back == n - 1){// if the queue has reached the last element.
            cout<<"queue overflow!"<<endl;
            return;
        }
        back++;
        arr[back] = x;
        
        if(front == -1){
            front++;
        }
    }
    
    void pop(){
        if(front == -1 || front > back){
            cout<<"No elements in queue."<<endl;
            return;
        }
        front++;
    }
    
    int peek(){
        if(front == -1 || front > back){
            cout<<"No elements in queue"<<endl;
            return -1;
        }
        return arr[front];
    }
    
    bool empty(){
        if(front == -1 || front > back){
            return true;
        }
        return false;
    }
};

int main(){
    
    Queue q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    
    cout<<q.peek()<<endl;
    q.pop();
    
    cout<<q.peek()<<endl;
    q.pop();
    
    cout<<q.peek()<<endl;
    q.pop();
    
    cout<<q.peek()<<endl;
    q.pop();
    
    cout<<q.peek()<<endl;
    q.pop();
    
    if(q.empty()){
        cout<<"Queue is empty!!";
    }
    else{
        cout<<"Queue is not empty!!";
    }
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
