#include<iostream>
#include<stack>
using namespace std;

bool isvalid(string s){
    int n = s.size();
    
    stack<char> st;
    bool ans = true;
    for(int i = 0; i < n; i++){
        if(s[i] == '{' || s[i] == '(' || s[i] == '['){
            st.push(s[i]);
        }
        else if(s[i] == '}'){
            if(st.top() == '{'){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
        else if(s[i] == ')'){
            if(st.top() == '('){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
        else if(s[i] == ']'){
            if(st.top() == '['){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
    }
    if(st.empty()){
        ans = true;
    }
    return ans;
}

int main(){
    string s = "{([])}";
    
    if(isvalid(s)){
        cout<<"Valid String!"<<endl;
    }
    else{
        cout<<"Invalid string."<<endl;
    }
    return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
#include <bits/stdc++.h>
using namespace std;

bool areBracketsBalanced(string expr){
	stack<char> temp;
	for (int i = 0; i < expr.length(); i++) {
		if (temp.empty()) {
			// If the stack is empty just push the current bracket
			temp.push(expr[i]);
		}
		else if ((temp.top() == '(' && expr[i] == ')')
				|| (temp.top() == '{' && expr[i] == '}')
				|| (temp.top() == '[' && expr[i] == ']')) {
			
			// If we found any complete pair of bracket then pop
			temp.pop();
		}
		else{
			temp.push(expr[i]);
		}
	}
	if (temp.empty()) {//Stack is empty return true.
		return true;
	}
	return false;
}

int main(){
	string expr = "{()}[]";

	if (areBracketsBalanced(expr))
		cout << "Balanced";
	else
		cout << "Not Balanced";
	return 0;
}
