// Time complexity -> O(n^2)
// Idea is to get the smallest element and swap it with the element on the first position.

public class Main{
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            // We are doing the swapping outside of the inner loop because if we did it inside it will swap for every element that is smaller than the current element not for the smallest element.
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            
        }
    }
    
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        int arr[] = {5, 4, 1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
}
