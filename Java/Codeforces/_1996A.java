// legs

import java.util.*;

public class _1996A {
    public static int countLegs(int legs) {
        int res = 0;
        while (legs > 0) {
            if (legs % 4 == 0) {
                res++;
                legs = legs - 4;
            } else {
                res++;
                legs = legs - 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();

        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.println(countLegs(arr[i]));
        }

        sc.close();
    }
}
