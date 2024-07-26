public class Main {
	public static void subarrays(int arr[]){
	    for(int i = 0; i < arr.length; i++){
	        for(int j = i; j < arr.length; j++){
            // In the below line, 'i' is start and 'j' is end. The concept is to just print all the elements in between of start and end.
	            for(int k = i; k <= j; k++){
	                System.out.print(arr[k] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}
	public static void main (String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        
		    subarrays(arr);
	}
}
