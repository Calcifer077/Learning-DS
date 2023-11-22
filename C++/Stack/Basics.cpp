#include<iostream>
using namespace std;

#define n 100
class stack{
  int* arr;
  int top;
  
  public:
  stack(){
      arr = new int[n];
      top = -1;
  }
  
  void push(int x){
      if(top == n-1){
          cout<<"Stack overflow!!"<<endl;
          return;
      }
      top++;
      arr[top] = x;
  }
  
  void pop(){
        if(top == -1){
            cout<<"No element to pop"<<endl;
            return;
        }
        top--;
  }
  
  int Top(){
        if(top == -1){
            cout<<"No element in stack!"<<endl;
            return -1;
        }
        return arr[top];
  }
  bool empty(){
      return top == -1;
  }
};
int main(){
    stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    cout<<st.Top()<<endl;//3
    st.pop();
    st.pop();
    cout<<st.Top()<<endl;//1
    st.pop();
    st.pop();//No element to pop
    cout<<st.Top()<<endl;//NO element in stack! && -1
    cout<<st.empty();//1
    return 0;
}

.........................................................................................
.........................................................................................
.........................................................................................
