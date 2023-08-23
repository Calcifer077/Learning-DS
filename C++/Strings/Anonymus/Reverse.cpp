#include<iostream>
using namespace std;

void swap(string str1, string str2){
    string temp;
    temp = str1;
    str1 = str2;
    str2 = temp;
}

int main(){
    string str = "Hello world!";
    cout<<str<<endl;
    int len = str.length();
    cout<<len<<endl;
    
    for(int i = 0; i < len / 2; i++){
        swap(str[i], str[len - 1 - i]);
    }
    for(int i = 0; i< len; i++){
        cout<<str[i];
    }
    return 0;
}
