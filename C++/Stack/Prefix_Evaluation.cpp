//Time Compelxity -> O(l) 'l' is the length of the string.
#include<iostream>
#include<stack>
#include<math.h>
using namespace std;

int prefixEvaluatioin(string s){
    stack<int> st;

    //go from right to left.
    for(int i = s.length() - 1; i >= 0; i--){
        if(s[i] >= '0' && s[i] <= '9'){
            st.push(s[i] - '0');//Will convert the character to integer when we subtract ascii value from the char.
        }
        else{
            int op1 = st.top();
            st.pop();
            int op2 = st.top();
            st.pop();
            
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
    return st.top();//will return the result.
}

int main(){
    cout<<prefixEvaluatioin("-+7*45+20")<<endl;
    return 0;
}
