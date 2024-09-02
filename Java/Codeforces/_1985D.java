import java.util.*;

public class _1985D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            String str[] = new String[row];
            for (int i = 0; i < row; i++) {
                str[i] = sc.next();
            }

            int hashCount[] = new int[row];
            for (int i = 0; i < row; i++) {
                char ch[] = str[i].toCharArray();
                for (int j = 0; j < col; j++) {
                    if (ch[j] == '#') {
                        hashCount[i]++;
                    }
                }
            }

            int max = Integer.MIN_VALUE;
            int rowPos = 0;

            for (int i = 0; i < row; i++) {
                if (max < hashCount[i]) {
                    max = hashCount[i];
                    rowPos = i;
                }
            }

            int finalCount[] = new int[col];
            char ch[] = str[rowPos].toCharArray();
            for (int i = 0; i < col; i++) {
                if (ch[i] == '.') {
                    finalCount[i] = 1;
                } else {
                    finalCount[i] = 2;
                }
            }

            int i = 0;
            int j = col - 1;
            while (i != j) {
                if (finalCount[i] == 1 && finalCount[j] == 1) {
                    i++;
                    j--;
                } else if (finalCount[i] == 2 && finalCount[j] == 1) {
                    j--;
                } else if (finalCount[i] == 1 && finalCount[j] == 2) {
                    i++;
                } else if (finalCount[i] == 2 && finalCount[j] == 2) {
                    i++;
                    j--;
                }
            }

            int rowCol = i + 1;
            System.out.println((rowPos + 1) + " " + rowCol);
            t--;
        }
        sc.close();
    }
}