...............................SELECTION SORT............................
//The below given program is of selection sort.
//It says that find the minimum element in your unsoerted array and swap it with element at begining.
//Time complexity -> One loop to to select an element in the array -> O(n).
//		     Another loop for comparison -> O(n).
//		     O(n) * O(n) = O(n^2).

//Space complexity -> O(1).

/*
Advantages of Selection sort ->
	1. Simple and easy to understand.
 	2. Works well on small datasets.

Disadvantages of Selection sort ->
	1. It takes a time of O(n^2) in both best cases and worst case.
 	2. Does not work well on large datasets.
  	3. It is not stable.
*/
#include<iostream>
using namespace std;

int main(){
	int arr[] = {12, 45, 23, 51, 19, 8};
	int size = sizeof(arr) / sizeof(arr[0]);
	for(int i = 0; i < size -1; i++){
		for(int j = i+1; j < size; j++){
			if(arr[j] < arr[i]){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	for(int i = 0; i < size; i++){
		cout<<arr[i]<<" ";
	}
	 
	return 0;
}
.........................................................................................
.........................................................................................
.........................................................................................
