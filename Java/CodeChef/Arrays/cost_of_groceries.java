import java.util.Scanner;

public class cost_of_groceries {

    public static int costOfGroceries(int freshness[], int prices[], int minimumFreshnessRequired) {
        int totalCost = 0;

        for (int i = 0; i < freshness.length; i++) {
            if (freshness[i] >= minimumFreshnessRequired) {
                totalCost += prices[i];
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            System.out.println(costOfGroceries(a, b, x));
        }
        sc.close();
    }
}
