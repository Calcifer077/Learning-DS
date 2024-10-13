// Ticket

// import java.util.*;

// public class _1676A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t > 0) {
//             int n = sc.nextInt();
//             if (n == 0)
//                 System.out.println("Yes");
//             else {
//                 int a = n % 10;
//                 n = n / 10;
//                 int b = n % 10;
//                 n = n / 10;
//                 int c = n % 10;
//                 n = n / 10;
//                 int d = n % 10;
//                 n = n / 10;
//                 int e = n % 10;
//                 n = n / 10;
//                 int f = n % 10;
//                 n = n / 10;
//                 if ((a + b + c) == (d + e + f))
//                     System.out.println("Yes");
//                 else
//                     System.out.println("No");
//             }
//             t--;
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class _1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            if ((s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0') == (s.charAt(3) - '0')
                    + (s.charAt(4) - '0') + (s.charAt(5) - '0')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }
}