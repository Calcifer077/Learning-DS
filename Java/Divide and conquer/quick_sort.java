public class quick_sort {
    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    // public static int partition(int arr[], int start, int end) {
    // int pivot = arr[end];
    // int i = -1;
    // int j = 0;
    // while (j < arr.length - 1) {
    // if (arr[j] < pivot) {
    // i++;
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // j++;
    // }

    // i++;
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;

    // return arr[i];
    // }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
