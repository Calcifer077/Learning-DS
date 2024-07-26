// Time complexity -> O(n^2)

import java.util.*;

public class Main {
    public static void maxSubArraySum(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int currSum = 0;
		int prefix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		// calculate prefix array
		for(int i = 1; i < arr.length; i++){
		    prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
				
				if(largest < currSum){
				    largest = currSum;
				}
			}
		}
		System.out.print(largest);
	}
  
	public static void main (String[] args) {
      int arr[] = {1, -2, 6, -1, 3};
      maxSubArraySum(arr);
  }
}
