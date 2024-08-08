public class check_if_a_array_is_sorted {
    public static boolean checkSorted(int nums[], int i) {
        if (i == nums.length - 1) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }
        return checkSorted(nums, i + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkSorted(nums, 0));
    }
}
