
#include<iostream>
using namespace std;

int main(){
	// take a array of size n which prints maximum and minimum.
	int size;
	cout<<"Ennter the size of the array:";
	cin>>size;
	int arr[size];
	for(int i =0;i<size;i++){
		cin>>arr[i];
	}
	int max = arr[0];
	for(int i = 0;i<size;i++){
		if(arr[0] < arr[i]){
			max = arr[i];
		}
	}
	cout<<max;
	
	return 0;
}

