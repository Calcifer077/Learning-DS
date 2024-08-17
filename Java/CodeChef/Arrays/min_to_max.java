import java.util.Scanner;

public class min_to_max {

    public static int calculateNumberOfMoves(int arr[]) {
        int numOfMoves = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum is " + min);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                numOfMoves++;
            }
        }

        return numOfMoves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println(calculateNumberOfMoves(a));
        }

        scanner.close();
    }
}
