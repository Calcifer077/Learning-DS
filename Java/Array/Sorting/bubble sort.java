// Time complexity -> O(n^2)

public class Main{
    public static void bubbleSort(int arr[]){
        // We are not going the full length of the array as our task is to shift the biggest element to the largest. Once it is dont there is no need to compare it to anyone.
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        int arr[] = {1,2,3,4,2};
        bubbleSort(arr);
        printArray(arr);
    }
}