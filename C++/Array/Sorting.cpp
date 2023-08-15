//Sorting is arranging of element in a particular order.
//The below given program is of selection sort.
//It says that find the minimum element in your unsoerted array and swap it with element at begining.
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