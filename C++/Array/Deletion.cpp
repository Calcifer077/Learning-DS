

#include<iostream>
using namespace std;

int deleteelement(int arr[], int n, int key){
	int i;
	for(i = 0; i < n; i++){
		if(arr[i] == key){
			break;
		}
	}
	if(i < n){
		n = n - 1;
		for(int j = i; j < n; j++){
			arr[j] = arr[j+1];
		}
	}
	return n;
}

int main(){
	int arr[] = {1,2,3,4,5};
	int size = sizeof(arr) / sizeof(arr[0]);
	cout<<"Enter the element you want to delete: ";
	int key;
	cin>>key;
	size = deleteelement(arr, size, key);
	for(int i =0; i<size;i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
