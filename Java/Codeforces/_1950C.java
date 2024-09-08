// Clock conversion

import java.util.Scanner;

public class _1950C {
    public static void solve(String str) {
        char ch[] = str.toCharArray();

        int hours = ((ch[0] - '0') * 10) + (ch[1] - '0');
        String minutes = ch[3] + "" + ch[4];
        String period;

        if (hours == 0) {
            hours = 12;
            period = "AM";
        } else if (hours < 12) {
            period = "AM";
        } else if (hours == 12) {
            period = "PM";
        } else {
            hours -= 12;
            period = "PM";
        }

        // 'printf' is used to print a formatted string.
        // d -> integer
        // s -> string
        // s -> string
        // 02 -> means that 0 is the padding meaning and 2 is the total number if
        // elements necessary.
        // If the hours is less that 10, meaning that it is 1 digit it will add a zero
        // in front of it.
        System.out.printf("%02d:%s %s\n", hours, minutes, period);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String str = sc.next();
            solve(str);
            t--;
        }
        sc.close();
    }
}
