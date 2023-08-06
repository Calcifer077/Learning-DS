#include<iostream>
using namespace std;
//traversal through an array: Transversal through an array simply mean to go from one index to another.
//It is simply taking inputs and displaying outputs.
int main(){
	int a[5];
	for(int i =0;i<5;i++){
		cin>>a[i];
	}
	for(int i = 0; i < 5; i++){
		cout<<a[i]<<" ";
	}
	return 0;
}
