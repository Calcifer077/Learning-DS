//Counting the number of elements in the string without the use of inbuilt funcions.
#include<iostream>
using namespace std;

int main(){
    string str = "Hello World!";
    int len;
    int count = 0;
    int i = 0;
    while(str[i] != NULL){
        count++;
        i++;
    }
    len = count;
    cout<<len;
    return 0;
}
#include<iostream>
using namespace std;
//Merging two string.
int main(){
    string str1 = "Hello ";
    string str2 = "World!";
    string result;
    for(int i = 0; i < str1.length(); i++){
        result = result + str1[i];
    }
    for(int i = 0; i < str2.length(); i++){
        result = result + str2[i];
    }
    cout<<result;
    
    return 0;
}
