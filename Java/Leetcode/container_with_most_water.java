public class container_with_most_water {
    public static int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;

        int max = Integer.MIN_VALUE;
        while (lp < rp) {
            int h = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            max = Math.max(max, width * h);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int h[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(h));
    }
}
