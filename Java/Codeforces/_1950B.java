// Upscaling

import java.util.*;

public class _1950B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    if ((i / 2 + j / 2) % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print('.');
                    }
                }

                System.out.println();
            }
            t--;
        }
        sc.close();
    }
}