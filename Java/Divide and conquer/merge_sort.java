public class merge_sort {
    // public static void mergeSort(int nums[], int start, int end) {
    // if (start < end) {
    // int mid = start + (end - start) / 2;
    // mergeSort(nums, start, mid);
    // mergeSort(nums, mid + 1, end);
    // merge(nums, start, mid, end);
    // }
    // }

    // public static void merge(int arr[], int start, int mid, int end) {

    // int n1 = mid - start + 1;
    // int n2 = end - mid;
    // int arr1[] = new int[n1];
    // int arr2[] = new int[n2];

    // for (int i = 0; i < n1; i++) {
    // arr1[i] = arr[start + i];
    // }

    // for (int j = 0; j < n2; j++) {
    // arr2[j] = arr[mid + 1 + j];
    // }

    // int i = 0;
    // int j = 0;
    // int k = start;
    // while (i < n1 && j < n2) {
    // if (arr1[i] <= arr2[j]) {
    // arr[k] = arr1[i];
    // i++;
    // } else {
    // arr[k] = arr2[j];
    // j++;
    // }
    // k++;
    // }

    // while (i < n1) {
    // arr[k] = arr1[i];
    // i++;
    // k++;
    // }

    // while (j < n2) {
    // arr[k] = arr2[j];
    // j++;
    // k++;
    // }
    // }

    public static void mergeSort(int nums[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, start + 1, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int nums[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j < end) {
            if (nums[k] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 2, 5, 8 };
        mergeSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
