import java.util.*;

public class difficulty_rating_order {
    public static void checkRating(int arr[]) {
        boolean res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                res = false;
                break;
            }
        }
        if (res == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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

            checkRating(arr);

            t--;
        }
        sc.close();
    }
}
