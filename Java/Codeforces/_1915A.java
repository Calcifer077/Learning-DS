// Odd one out

import java.util.*;

public class _1915A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int arr[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int i = 0; i < 2; i++) {
                if (arr[i] == arr[i + 1]) {
                    arr[i] = arr[i + 1] = 11;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (arr[i] != 11) {
                    System.out.println(arr[i]);
                    break;
                }
            }

            t--;
        }
        sc.close();
    }
}