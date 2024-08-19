// Seating in a bus

import java.util.*;

public class _2000B {
    public static void seatingInBus(int arr[]) {
        int size = arr.length;
        int temp[] = new int[size + 1];
        boolean res = false;
        int counter = 0;
        while (counter < size) {
            temp[arr[counter]] = arr[counter];
            if (counter == 0) {
                counter++;
            } else {
                if (temp[counter - 1] != 0 || temp[counter + 1] != 0) {
                    res = true;
                    counter++;
                    break;
                }
            }
        }
        if (res == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            seatingInBus(arr);
            t--;
        }
        sc.close();
    }
}
