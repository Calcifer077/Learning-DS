import java.util.*;

public class _1992A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int arr[] = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            int count = 0;
            while (count < 5) {
                if (a <= b && a <= c) {
                    a++;
                    count++;
                } else if (b <= a && b <= c) {
                    b++;
                    count++;
                } else if (c <= b && c <= a) {
                    c++;
                    count++;
                }
            }

            System.out.println(a * b * c);

            t--;
        }
        sc.close();
    }
}