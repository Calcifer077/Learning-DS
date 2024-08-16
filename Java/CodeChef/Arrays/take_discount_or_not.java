import java.util.Scanner;

public class take_discount_or_not {
    public static boolean takeDiscountOrNot(int arr[], int couponPrice, int couponDiscount) {
        int sumWithoutDiscount = 0;
        int sumWithDiscount = couponPrice;

        for (int i = 0; i < arr.length; i++) {
            sumWithoutDiscount += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < couponDiscount) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i] - couponDiscount;
            }
            sumWithDiscount += arr[i];
        }

        if (sumWithDiscount < sumWithoutDiscount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(takeDiscountOrNot(a, x, y));

            t--;
        }
        sc.close();
    }
}
