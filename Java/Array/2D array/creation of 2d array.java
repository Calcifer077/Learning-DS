import java.util.*;

public class Main{
    public static void main (String[] args) {
        int matrix[][] = new int[3][3];
        // Here, we are getting the number of rows
        int n = matrix.length;
        // Here, we are getting the number of columns by asking the length of first row.
        int m = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}