#include<iostream>
using namespace std;

int main(){
    string str = "CSE_Dep@rtment CS_201";
    cout<<str<<endl;
    int len = str.length();
    cout<<len<<endl;
    int lower = 0;
    int upper = 0;
    int special = 0;
    int numeric = 0;
    int spaces = 0;
    for(int i = 0; i < len; i++){
        if(str[i] >= 'a' && str[i] <= 'z'){
            lower++;
        }
        else if(str[i] >= 'A' && str[i] <= 'Z'){
            upper++;
        }
        else if(str[i] == ' '){
            spaces++;
        }
        else if(str[i] >= '0' && str[i] <= '9'){
            numeric++;
        }
        else{
            special++;
        }
    }
    cout<<"The number of upper cases is "<<upper<<endl;
    cout<<"The number of lower cases is "<<lower<<endl;
    cout<<"The number of numeric values is "<<numeric<<endl;
    cout<<"THe number of spaces is "<<spaces<<endl;
    cout<<"The number of special character is "<<special<<endl;
    return 0;
}

