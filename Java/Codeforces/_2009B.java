import java.util.*;

public class _2009B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = sc.nextInt();
            int col = 4;
            String str[] = new String[row];

            for (int i = 0; i < row; i++) {
                str[i] = sc.next();
            }

            int res[] = new int[row];
            for (int i = row - 1; i >= 0; i--) {
                char ch[] = str[i].toCharArray();
                for (int j = col - 1; j >= 0; j--) {
                    if (ch[j] == '#') {
                        res[i] = j;
                    }
                }
            }

            for (int i = row - 1; i >= 0; i--) {
                System.out.print((res[i] + 1) + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}