public class nQueens {
    public static void nQueensSolution(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // How backtracking works here.
        // You will go down the matrix or the chess board from the top left and try to
        // place a queen at each place.
        // Once you have placed a queen in a row and it is safe to place it there,you
        // will call the function for the next row.
        // If it is not safe to place it there, you have to place a '.' there.
        // If in some further row you placed a queen correctly in first few rows but it
        // is not safe to place it there. You will backtrack it meaning that the
        // function will be popped from the call stack. after popping, the last line of
        // the below function 'borad[row][j] = '.' will run placing '.' at that place as
        // it is not safe to place it there.'
        // After that the loop will run and increment 'j' which tells the current col.
        // Place the queen there and do the above step again until you have reached
        // borad length.
        for (int j = 0; j < board.length; j++) {
            // If it is safe to place 'Q' at a certain place otherwise place '.'
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueensSolution(board, row + 1); // function call
            }
            board[row][j] = '.'; // backtracking step

        }
    }
    // public static boolean nQueensSolution(char board[][], int row) {
    // if (row == board.length) {
    // return true;
    // }

    // for (int j = 0; j < board.length; j++) {
    // board[row][j] = 'Q';
    // if (nQueensSolution(board, row + 1)) {
    // return true;
    // } else {
    // board[row][j] = '.';
    // }
    // }

    // return false;
    // }

    public static boolean isSafe(char board[][], int row, int col) {
        // We are only checking upwards because we start placing queens from the top.

        // Vertical up -> checking for any other queen in the same column.
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagnol right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueensSolution(board, 0);
    }
}
