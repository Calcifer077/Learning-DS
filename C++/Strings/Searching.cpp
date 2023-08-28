#include<iostream>
using namespace std;

int main(){
    string str = {"abcdefghijklmnopqrstuvwxyz!"};
    cout<<"Enter the character which you want to search: ";
    char a; cin>>a;
    int len = str.length();
    int counter = 0;
    int index;
    for(int i = 0; i < len; i++){
        if(str[i] == a){
            counter++;
            index = i;
            break;
        }
    }
    if(counter == 1){
        cout<<"Element found at "<<index + 1<<endl;
    }
    else{
        cout<<"Element not found."<<endl;
    }
    return 0;
}
