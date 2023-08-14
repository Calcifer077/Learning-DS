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


#include<iostream>
using namespace std;

int binarysearch(int arr[], int size, int key){
	int low, mid, high;
	low  = 0;
	high = size - 1;
	while(low <= high){
		mid = (low + high)/2;
		if(arr[mid] == key){
			return mid;
		}
		if(arr[mid < key]){
			low = mid + 1;
		}
		else{
			high = mid - 1;
		}
	}
	return -1;
}
int main(){
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int size = sizeof(arr) / sizeof(arr[0]);
	int key = 8;
	int index = binarysearch(arr, size, key);
	cout<<"ELement found at "<<index;
	return 0;
}
