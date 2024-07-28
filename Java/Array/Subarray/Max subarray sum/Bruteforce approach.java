// Time complexity is O(n^3) as the loop runs three times.

import java.util.*;

public class Main {
	public static void maxSubArraySum(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int sum = 0;
    // We are calculating the sub arrays and there sum for each sub array. If that sum is greater than 'largest' we will update it. This will go no until there is no more subarray to print.
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				sum = 0;
				for(int k = i; k <= j; k++) {
					sum += arr[k];
					System.out.println(sum);
					if(sum > largest) {
						largest = sum;
					}
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
