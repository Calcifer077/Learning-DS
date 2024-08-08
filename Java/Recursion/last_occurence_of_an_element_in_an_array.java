public class last_occurence_of_an_element_in_an_array {
    public static int lastOccurance(int arr[], int i, int target) {

        if (i == 0) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return lastOccurance(arr, i - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 19, 2, 5, 3 };
        int target = 5;
        System.out.println(lastOccurance(arr, arr.length - 1, target));
    }
}
