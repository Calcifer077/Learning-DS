#include<iostream>
using namespace std;

int main(){
    int arr[] = {1,2,3,4,5,6,7};
    int size = sizeof(arr) / sizeof(arr[0]);
    int d = 2;
    
    int temp[size];
    int k = 0;
    for(int i = d; i < size - 1; i++){
        temp[k] = arr[i];
        k++;
    }
    for(int i = 0; i < d; i++){
        temp[k] = arr[i];
        k++;
    }
    for(int i = 0; i < k; i++){
        cout<<temp[i]<<" ";
    }
    return 0;
}
