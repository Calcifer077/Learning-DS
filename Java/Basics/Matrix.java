import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for your array: ");
        int r = in.nextInt();
        int c = in.nextInt();
        
        int[][] arr = new int[10][10];
        System.out.println("Enter your array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\r");
        }
    }
}
