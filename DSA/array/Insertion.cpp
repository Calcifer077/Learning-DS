// Insertion in array means to add a element in an array without deleting other elements.
// It can be done by two methods one of which is to add the element at the last position without moving other elements while the other is to
// add the element in between and moving elements with more index one index back.


..............................METHOD I...........................



#include<iostream>
using namespace std;
//Insertion an element in an array:

int insert(int arr[], int n, int key, int size){
	if(n >= size){
		return n;
	}
	arr[n] = key;
	return (n+1);
}

int main(){
	int arr[20] = {1,2,3,4,5};
	int size = sizeof(arr)/ sizeof(arr[0]);
	int n = 5;
	int i, key = 6;
	
	cout<<"Before Insertion: ";
	for(i = 0; i < n; i++){
		cout<<arr[i]<<" ";
	}
	
	n = insert(arr, n, key, size);
	cout<<"\n";
	cout<<"After Insertion: ";
	for(i = 0; i < n; i++){
		cout<<arr[i]<<" ";
	}
	
	return 0;
}

............................METHOD II.......................................
 #include<iostream>
using namespace std;

int main(){
	int arr[10] = {1,2,4,5};
	int n = 4;
	int pos, num;
	cout<<"Enter the posiition for the number: ";
	cin>>pos;
	cout<<"Enter the number you want to enter:";
	cin>>num;
	cout<<"Before Insertion: "<<endl;
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	cout<<"\n";
	for(int i = n-1; i>= pos; i--){
		arr[i+1] = arr[i];
	}
	arr[pos] = num;
	
	cout<<"After Inseertion: "<<endl;
	for(int i = 0; i<n+1; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
} 
