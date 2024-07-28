import java.util.*;

public class Main {
    public static void kadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum is : " + maxSum);
    }

	public static void main (String[] args) {
      int arr[] = {1, -2, 6, -1, 3};
      kadanes(arr);
	}
}
