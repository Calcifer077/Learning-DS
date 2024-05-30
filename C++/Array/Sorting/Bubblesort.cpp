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
.........................................................................
.........................................................................	
.........................................................................

#include<iostream>
using namespace std;

void bubbleSort(int arr[], int size){
    int i, j;
    bool swaped;
    
    for(i = 0; i < size - 1; i++){
        swaped = false;
        for(j = 0; j < size - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaped = true;
            }
        }
        if(swaped == false){
            break;
        }
    }
}

void printArray(int arr[], int size){
    for(int i = 0 ; i < size; i++){
        cout<<arr[i]<<" ";
    }
}
int main(){
    int arr[] = {7,3,8,1,5};
    int size = sizeof(arr)/sizeof(arr[0]);
    bubbleSort(arr, size);
    printArray(arr, size);
    
    return 0;
}
