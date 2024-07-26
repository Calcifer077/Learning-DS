// Time complexity -> O(logn)

public class Main {
	public static int binarySearch(int arr[], int key){
	    int start = 0;
	    int end = arr.length - 1;
	    while(start <= end){
	        int mid = (start + end)/2;
	        if(key == arr[mid]){
	            return mid;
	        }
	        if(key > arr[mid]){
	            start = mid + 1;
	        }
	        else{
	            end = mid - 1;
	        }
	    }
      // If key is not found
	    return -1;
	}
	public static void main (String[] args) {
    int arr[] = {2, 4, 6, 8, 10};
		System.out.println(binarySearch(arr, 10));
		
	}
}
