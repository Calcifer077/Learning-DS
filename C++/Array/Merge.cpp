#include<iostream>
using namespace std;

int main(){
    int arr1[] = {1,2,3,4,5,6,7};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int arr2[] = {8,9,10};
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    
    int arr3[size1 + size2];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    while(i < size1){
        arr3[k] = arr1[i];
        k++;
        i++;
    }
    while(j < size2){
        arr3[k] = arr2[j];
        k++;
        j++;
    }
    
    for(int l = 0; l < k; l++){
        cout<<arr3[l]<<" ";
    }
    return 0;
}
