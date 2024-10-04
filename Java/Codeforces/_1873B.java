import java.util.*;

public class _1873B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(arr[i], min);
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] == min) {
                    arr[i]++;
                    break;
                }
            }

            int product = 1;
            for (int i = 0; i < n; i++) {
                product = product * arr[i];
            }

            System.out.println(product);

            t--;
        }
        sc.close();
    }
}