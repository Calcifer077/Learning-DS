//Subarrays are the contiguos part of memeory. An arrat that is inside another array
//Number of subarrays :-> n*(n+1)/2
#include<iostream>
using namespace std;

void subarray(int arr[], int n){
	for(int i = 0; i < n;i++){
		for(int j = i; j < n; j++){
			for(int k = i;k <= j;k++){
				cout<<arr[k]<<" ";
			}
			cout<<" \n";
		}
	}
}
int main(){
	int arr[] = {1,2,3,4};
	int size = sizeof(arr) / sizeof(arr[0]);
	subarray(arr, size);
	return 0;
}
