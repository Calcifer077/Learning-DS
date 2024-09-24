import java.util.Scanner;

public class _2014B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int leaves = n * (n + 1) / 2;

            int totalLeaves = 0;
            if (n - k >= 1) {
                totalLeaves = (n - k) * (n - k + 1) / 2;
            }

            int leavesEnd = leaves - totalLeaves;
            if (leavesEnd % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}