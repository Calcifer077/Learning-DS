import java.util.*;

public class _1980B {
    public static void reverse(int[] array) {
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int favirte = arr[f - 1];

            Arrays.sort(arr);
            reverse(arr);

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == favirte) {
                    count++;
                }
            }
            int startingIdx = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == favirte) {
                    startingIdx = i;
                    break;
                }
            }

            if (startingIdx >= k) {
                System.out.println("NO");
            } else if (k > count + startingIdx - 1) {
                System.out.println("YES");
            } else {
                System.out.println("MAYBE");
            }

            t--;
        }
        sc.close();
    }
}
