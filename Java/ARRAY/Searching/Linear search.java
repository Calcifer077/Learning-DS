public class Main {
	public static int linearSearch(int arr[], int key){
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == key){
	            return (i+1);
	        }
	    }
	    return -1;
	}
	public static void main (String[] args) {
		int arr[] = {2, 5, 9, 10, 1, 3, 14};
		System.out.println(linearSearch(arr, 10));
	}
}
