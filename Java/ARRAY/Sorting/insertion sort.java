public class Main{
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            
            // Here, we are checking if the current element is shorter than the element on the left side of it. If so shift those elements to the right side to create space for the new element.
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            
            // Here, we are placing the current element to its right position
            arr[prev+1] = curr;
        }
    }
    
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        int arr[] = {5, 4, 1,3,2};
        insertionSort(arr);
        printArray(arr);
    }
}