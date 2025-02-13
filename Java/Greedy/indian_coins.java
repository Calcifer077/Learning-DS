package Java.Greedy;

public class indian_coins {
    public static int solve(int val) {
        int res = 0;

        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i] <= val) {
                val -= arr[i];
                res++;
            }
        }

        return res;
    }

    // public static int solve(int val) {
    // int res = 0;

    // int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

    // int start = 0;
    // int end = arr.length - 1;

    // while (val > 0) {
    // int mid = (start + end) / 2;
    // if (arr[mid] <= val) {

    // }
    // }

    // return res;
    // }

    public static void main(String[] args) {
        int val = 590;
        System.out.println(solve(val));
    }
}
