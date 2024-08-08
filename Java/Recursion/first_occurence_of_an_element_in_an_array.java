// You are given a array of elements. You have to return the index when a certain element occurs for the first time in the array.

public class first_occurence_of_an_element_in_an_array {
    public static int firstOccurance(int arr[], int i, int target) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (target == arr[i]) {
            return i;
        }

        return firstOccurance(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int target = 5;
        System.out.println(firstOccurance(arr, 0, target));
    }
}
