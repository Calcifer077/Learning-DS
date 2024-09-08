// Where's the bishop?

import java.util.*;

public class _1692C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int row = 8;
            int col = 8;

            String[] str = new String[8];
            for (int i = 0; i < row; i++) {
                str[i] = sc.next();
            }

            char chessBorad[][] = new char[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    chessBorad[i][j] = str[i].charAt(j);
                }
            }

            int posRow = 0;
            int posCol = 0;
            for (int i = 0; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if ((chessBorad[i][j - 1] == '#' && chessBorad[i][j + 1] == '#') && chessBorad[i + 1][j] == '#') {
                        posRow = i;
                        posCol = j;
                    }
                }
            }
            posRow = posRow + 2;
            posCol = posCol + 1;

            System.out.println(posRow + " " + posCol);
            t--;
        }
        sc.close();
    }
}
