public class search_in_a_rotated_sorted_array {
    public static int search(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Element is on mid
        if (arr[mid] == target) {
            return mid;
        }

        // Element is on line 1
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                // on left side of line 1
                return search(arr, target, start, mid - 1);
            } else {
                // on right side of line 1
                return search(arr, target, mid + 1, end);
            }
        } else { // Element is on line 2
            if (arr[mid] <= target && target <= arr[end]) {
                // on right side of mid
                return search(arr, target, mid + 1, end);
            } else {
                // on left side of mid
                return search(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
