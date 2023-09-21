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
#include<iostream>
#include<stack>
#include<algorithm>
using namespace std;

int prec(char c){
    if(c == '^'){
        return 3;
    }
    else if(c == '/' || c == '*'){
        return 2;
    }
    else if(c == '+' || c == '-'){
        return 1;
    }
    else{
        return -1;
    }
}

string infixtoprefix(string s){
    reverse(s.begin(), s.end());
    
    stack<char> st;
    string res;
    
    for(int i = 0; i < s.length(); i++){
        if((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i]) <= 'Z'){
            res += s[i];
        }
        else if(s[i] == ')'){
            st.push(s[i]);
        }
        else if(s[i] == '('){
            while(!st.empty() && st.top() != ')'){
                res += st.top();
                st.pop();
            }
            if(!st.empty()){
                st.pop();    
            }
        }
        else{
            while(!st.empty() && prec(st.top()) >= prec(s[i])){
                res += st.top();
                st.pop();
            }
            st.push(s[i]);
        }
    }
    while(!st.empty()){
        res += st.top();
        st.pop();
    }
    reverse(res.begin(), res.end());
    return res;
}

int main()
{
    cout<<infixtoprefix("(a-b/c)*(a/k-l)")<<endl;
    return 0;
}
