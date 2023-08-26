#include<iostream>
using namespace std;

void sorting(int arr[], int n){
	for(int i = 0; i < n - 1; i++){
		for(int j = i + 1 ; j < n; j++){
			if(arr[j] < arr[i]){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
int main(){
	int a1[] = {1,2,3,5,7,3,2};
	int n1 = sizeof(a1) / sizeof(a1[0]);
	int a2[] = {4,5,6,5,2,6};
	int n2 = sizeof(a2) / sizeof(a2[0]);
	int n3 = n1 + n2;
	int a3[n3];
	int i = 0, j = 0, k = 0;
	while(i < n1){
		a3[k++] = a1[i++];
	}
	while(j < n2){
		a3[k++] = a2[j++];
	}
	
	sorting(a3, n3);
	for(k = 0; k < n3;k++){
		cout<<a3[k]<<" ";
	}
	return 0;
}
