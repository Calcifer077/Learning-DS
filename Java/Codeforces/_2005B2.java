import java.util.*;

public class _2005B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int q = scanner.nextInt();

            int[] teacher = new int[m];
            for (int i = 0; i < m; i++) {
                teacher[i] = scanner.nextInt();
            }

            Arrays.sort(teacher);

            for (int i = 0; i < q; i++) {
                int b = scanner.nextInt();
                int k = upperBound(teacher, b);

                if (k == 0) {
                    System.out.println((teacher[0] - 1));
                } else if (k == m) {
                    System.out.println((n - teacher[m - 1]));
                } else {
                    System.out.println((teacher[k] - teacher[k - 1]) / 2);
                }
            }
        }
        scanner.close();
    }

    private static int upperBound(int[] teacher, int b) {
        int left = 0, right = teacher.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (teacher[mid] <= b) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
