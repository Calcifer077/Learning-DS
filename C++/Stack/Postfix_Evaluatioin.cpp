#include<iostream>
#include<stack>
#include<math.h>
using namespace std;
//phele pop krenge co aayega op2;
int postEvaluatioin(string s){
    stack<int> st;
    
    for(int i = 0; i<s.length(); i++){
        if(s[i] >= '0' && s[i] <= '9'){
            st.push(s[i] - '0');//If we subtract the ascii value of 0 from any character we will get integer.
        }
        
        else{
            int op2 = st.top();
            st.pop();
            int op1 = st.top();
            st.top(); 
            
            switch(s[i]){
                case '+':
                    st.push(op1 + op2);
                    break;
                
                case '-':
                    st.push(op1 - op2);
                    break;
                
                case '*':
                    st.push(op1 * op2);
                    break;
                    
                case '/':
                    st.push(op1 / op2);
                    break;
                    
                case '^':
                    st.push(pow(op1, op2));
                    break;
                default:
                    break;
            }
        }
    }
    return st.top();
}

int main(){
    cout<<postEvaluatioin("46+2/5*7+");
    return 0;
}
