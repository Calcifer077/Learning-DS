public class print_triplets {
    public static void printTriplets(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // int nums[] = { -1, 0, 1, 2, -1, -4 };
        int nums[] = { 1, 2, 3, 4, 5 };
        printTriplets(nums);
    }
}
