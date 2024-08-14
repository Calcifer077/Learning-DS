public class largest_and_smallest_in_array {
	public static void largestAndSmallest(int arr[]) {
		// Both below values comes from the 'util' package.
		int largest = Integer.MIN_VALUE; // - Infinity
		int smallest = Integer.MAX_VALUE; // +Infinity
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(largest + " , " + smallest);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 10, 1, 3, 14 };
		largestAndSmallest(arr);
	}
}
