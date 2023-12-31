#include<iostream>
#include<stack>
using namespace std;

void revese(string s){
    stack<string> st;
    
    for(int i = 0; i <s.length(); i++){
        string word = "";
        while(s[i] != ' ' && i<s.length()){//This while loop will work until we encounter a ' ' or we reach the end of the string.
            word += s[i];
            i++;
        }
        st.push(word);
    }
    while(!st.empty()){//while stack is not empty.
        cout<<st.top()<<" ";
        st.pop();
    }
    cout<<endl;
}
int main(){
    string s = "Hey, how are you doing?";
    revese(s);
    return 0;
}
