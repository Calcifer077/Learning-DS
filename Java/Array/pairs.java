public class pairs {
	public static void findPairs(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("( " + arr[i] + " " + arr[j] + " ) , ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 10, 1, 3, 14 };
		findPairs(arr);
	}
}
