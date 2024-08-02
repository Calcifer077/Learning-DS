public class reverse_an_array {

	public static void reverseArray(int arr[]) {
		int first = 0, last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 7, 10 };
		reverseArray(arr); // This will be updated because arrays are passed by reference.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
