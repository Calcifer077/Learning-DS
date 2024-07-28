public class Main {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol =  matrix[0].length -1;
            
        // We are taking equal to sign for case when the number of rows and columns are odd. In case of odd number of rows, the last case will be where a single cell will be left. 
        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            
            // right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            
            // bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            
            // left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        
        System.out.println();
    }
	public static void main (String[] args) {
		int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
	}
}
