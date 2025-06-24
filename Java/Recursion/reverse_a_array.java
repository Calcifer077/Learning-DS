public class reverse_a_array {
    public static void reverse(int arr[], int i) {
        if (i >= arr.length / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

        reverse(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        reverse(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
