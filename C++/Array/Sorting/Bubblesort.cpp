//THe below given is Bubble sort.
//According to this algorithm we repeatedly swap two adjacent elements if they are in wrong order. Meaning if the element that comes first
//	is larger than the element that comes later on.
//	THis algo runs for " size - 1 " iterations before we get our sorted array.	
//This sorting is a stable sorting technique which means that the elements which have the same value will also have the same value in the final result.
//Time complexity -> O(n^2).
//Space complexity -> O(1). 
#include<iostream>
using namespace std;

int main(){
	int arr[] = {23, 12, 99, 7, 54, 65};
	int size = sizeof(arr) / sizeof(arr[0]);
	int counter = 1;
	while(counter < size){
		for(int i = 0; i < size -1;i++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		counter++;
	}
	for(int i = 0; i < size; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
