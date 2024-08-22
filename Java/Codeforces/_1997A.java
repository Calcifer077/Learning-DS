// Strong passwords

// import java.util.*;

// public class _1997A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
//         while (t > 0) {
//             String s = sc.next();
//             // String s = "password";
//             StringBuilder sb = new StringBuilder();

//             boolean b = false;

//             for (int i = 0; i < s.length(); i++) {
//                 sb.append(s.charAt(i));
//                 if (!b) {

//                     if (i < s.length() - 1) {
//                         if (s.charAt(i) == s.charAt(i + 1)) {

//                             b = true;
//                             char a = s.charAt(i);
//                             a++;
//                             sb.append(a);

//                         }

//                     }
//                 }
//             }
//             if (!b) {
//                 if (sb.charAt(sb.length() - 1) == 'z') {
//                     sb.append('y');
//                 } else {
//                     sb.append('z');
//                 }
//             }
//             System.out.println(sb);

//             t--;
//         }

//         sc.close();
//     }
// }

import java.util.*;

public class _1997A {
    public static void strongPassword(String s) {
        String sb = "";
        int pos = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                pos = i;
            }
        }

        if (pos == -1) {
            if (s.charAt(s.length() - 1) == 'a') {

                sb = s + "b";
            } else {
                sb = s + "a";
            }
        } else {
            // 'substring' -> as the name suggests substring is used to create substrings.
            // From a certain index to some other index. Other index is not included in the
            // substring.
            if (s.charAt(pos) == 'a') {
                sb = s.substring(0, pos + 1) + "b" + s.substring(pos + 1, s.length());
            } else {
                sb = s.substring(0, pos + 1) + "a" + s.substring(pos + 1, s.length());
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            strongPassword(s);
        }
        sc.close();
    }
}