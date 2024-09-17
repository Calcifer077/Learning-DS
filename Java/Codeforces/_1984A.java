
// Strange splitting
import java.util.*;

public class _1984A {

    public static void solve(int arr[]) {
        char ch[] = new char[arr.length];

        if (arr.length % 2 == 0) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            }

            if (count == arr.length - 1) {
                System.out.println("NO");
                return;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    ch[i] = 'R';
                }
                ch[arr.length / 2] = 'B';
                System.out.println("YES");
                System.out.println(String.valueOf(ch));
                return;
            }
        } else {
            int i = 0;
            int j = arr.length - 1;
            int count = 0;
            while (i < arr.length / 2 && j > arr.length / 2) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                ch[i] = ch[j] = 'R';
                i++;
                j--;
            }
            ch[i] = 'B';

            if (count == arr.length / 2) {
                System.out.println("NO");
                return;
            } else {
                System.out.println("YES");
                System.out.println(String.valueOf(ch));
                return;
            }
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

            solve(arr);
            t--;
        }
        sc.close();
    }
}