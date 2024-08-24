// Marathon

import java.util.Scanner;

public class _1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int arr[] = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 1; i < 4; i++) {
                if (arr[i] > arr[0]) {
                    count++;
                }
            }
            System.out.println(count);

            t--;
        }
        sc.close();
    }
}
