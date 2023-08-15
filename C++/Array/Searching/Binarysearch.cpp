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
		if(arr[mid] < key){
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
