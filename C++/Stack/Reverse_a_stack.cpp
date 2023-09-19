#include<iostream>
#include<stack>
using namespace std;

int main(){
    stack<int> s1;
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);
    
    stack<int> s2;
    while(!s1.empty()){
        s2.push(s1.top());
        s1.pop();
    }
    
    while(!s2.empty()){
        cout<<s2.top()<<endl;
        s2.pop();
    }
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
......................RECURSIVE WAY..................
#include<iostream>
#include<stack>
using namespace std;

void insertatbottom(stack<int> &st, int element){
    if(st.empty()){
        st.push(element);
        return;
    }
    
    int top_element = st.top();
    st.pop();
    insertatbottom(st, element);
    
    st.push(top_element);
}

void reverse(stack<int> &st){
    if(st.empty()){
        return;
    }
    int element = st.top();
    st.pop();
    reverse(st);
    
    insertatbottom(st, element);
}

int main(){
        stack<int> st;
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        reverse(st);
        while(!st.empty()){
            cout<<st.top()<<endl;
            st.pop();
        }
    return 0;
}
