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
