public class arrays_are_passed_by_reference {
    public static void updateArray(int arr[], int nonChangeable) {
        // Below variable's value will not be changed in the main function as they are
        // passed by value;
        nonChangeable = 10;

        // Arrays are passed by reference so the change we make on this file here will
        // reflect in the main function.
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void main(String[] args) {
        // A way of creating arrays
        // int arr[] = new int[10]; // You can also create a array like this. In this
        // case an empty array will be created of size 10
        int arr[] = { 1, 2, 3 };
        int nonChangeable = 5;
        updateArray(arr, nonChangeable);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(nonChangeable);
    }
}
