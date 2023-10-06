    ........METHOD I...........
#include<bits/stdc++.h>
using namespace std;
//Making push operation costly.

class Stack{
    int N;//Size of stack
    queue<int> q1;//It is the resultant Queue.
    queue<int> q2;
    
    public:
    Stack(){
        N = 0;
    }
    void Push(int val){
        q2.push(val);
        N++;
        while(!q1.empty()){
            q2.push(q1.front());
            q1.pop();
        }
        swap(q1, q2);
    }
    void Pop(){
        q1.pop();
        N--;
    }
    int Top(){
        return q1.front();
    }
    int size(){
        return N;
    }
};
int main(){
    Stack st;
    st.Push(1);
    st.Push(2);
    st.Push(3);
    st.Push(4);
    
    cout<<st.Top()<<endl;
    st.Pop();
    
    cout<<st.Top()<<endl;
    
    cout<<st.size()<<endl;
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
    ........METHOD II..........
#include<bits/stdc++.h>
using namespace std;
//Making pop operation costly

class Stack{
    int N;
    queue<int> q1;//It is the result.
    queue<int> q2;
    
    public:
        Stack(){
            N = 0;
        }
        
        void pop(){
            if(q1.empty()){//If there are no elements in the Queue it will mean the queue is empty.
                return;
            }
            while(q1.size() != 1){//While there is only one element in the queue.
                                  //That last element will be the element to pop
                                  //We will be storing all the popped elements in q2 and swap them at last to see the result.
                q2.push(q1.front());
                q1.pop();
            }
            q1.pop();
            N--;
            
            swap(q1, q2);
        }
        
        void push(int val){
            q1.push(val);
            N++;
        }
        
        int top(){//The top value will be the value on the last of q1.
                //To obtain that value we will have to empty the queue until the last element and store it in a 'ans' variable.
            if(q1.empty()){
                return -1;
            }
            while(q1.size() != 1){
                q2.push(q1.front());
                q1.pop();
            }
            int ans = q1.front();//Storing that 'ans' here.
            q2.push(ans);//Push this element into q2 to maintain original order.
            
            queue<int> temp = q1;//swapping them.
            q1 = q2;
            q2 = temp;
            
            return ans;
        }
        int size(){
            return N;
        }
};
int main(){
    Stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    
    cout<<st.top()<<endl;
    st.pop();
    
    cout<<st.top()<<endl;
    
    cout<<st.size();
    return 0;
}
