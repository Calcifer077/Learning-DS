//There are two methods of searching for a element.
//	1. Linear Search -> In this type of search array transversal is used to through the array in a linear way starting from index 0.
//				It can be used for both Sorted and Unsorted array.
//	2. Binary Search -> In this type of search array is divided in two halfs and it is checked in which half does the element lie.
//				Accordingly, The searching is done.
//				It can be only done on Sorted array.
//To search for a particular element in an array.
#include<iostream>
using namespace std;

int main(){
	int arr[5];
	for(int i = 0; i < 5; i++){
		cin>>arr[i];
	}
	int key;
	cout<<"Enter the element you want to search:";
	cin>>key;
	int result;
	for(int i = 0; i<5; i++){
		if(arr[i] == key){
			result = i;
		}
	}
	cout<<"Element found at "<<result+1;
	return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
//Using function for the same thing as above:
#include<iostream>
using namespace std;

int find(int arr[], int n, int key){
	for(int i = 0; i<n;i++){
		if(key == arr[i]){
			return i;
		}
}// A function end when a value is returned. So this function end here after returning value as 'i';
	return -1;
	
}
int main(){
	int arr[] = {1,2,3,4,5};
	int n = (sizeof(arr) / sizeof(arr[0]));
	cout<<"ENter the element you want to search:";
	int key;
	cin>>key;
	int result = find(arr, n, key);
	
	if(result == -1){
		cout<<"element not found";
	}
	else{
		cout<<"Element found at "<<result+1;
	}
	return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
