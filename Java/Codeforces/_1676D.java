// X-sum

import java.util.*;

public class _1676D {
    public static int addDiagnol(int board[][], int row, int col) {
        int i = row;
        int j = col;
        int res = 0;

        // diagnolly left up
        while (i >= 0 && j >= 0) {
            res += board[i][j];
            i--;
            j--;
        }

        i = row;
        j = col;
        // diagnoally right up
        while (i > 0 && j < board[row].length - 1) {
            i--;
            j++;
            res += board[i][j];
        }

        i = row;
        j = col;
        // diagnoally left down
        while (i < board.length - 1 && j > 0) {
            i++;
            j--;
            res += board[i][j];
        }
        i = row;
        j = col;

        while (i < board.length - 1 && j < board[row].length - 1) {
            i++;
            j++;
            res += board[i][j];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            int board[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    max = Math.max(max, addDiagnol(board, i, j));
                }
            }

            System.out.println(max);
            t--;
        }
        sc.close();
    }
}