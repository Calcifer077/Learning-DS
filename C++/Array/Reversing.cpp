#include<iostream>
using namespace std;

int main(){
	//Reverse an array;
	int arr[] =  {1,2,3,4,5};
	int size = sizeof(arr) / sizeof(arr[0]);
	int i,j,temp;
	for(i = 0,j = size - 1; i < size/2; i++,j--){
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	for(i = 0; i < size; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
