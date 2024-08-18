// Soldiers and bananas

import java.util.*;

public class _546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int costOfBanana = sc.nextInt();
        int initialNumOfDollars = sc.nextInt();
        int numOfBanana = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < numOfBanana; i++) {
            sum += (i + 1) * costOfBanana;
        }

        int res = sum - initialNumOfDollars;
        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
