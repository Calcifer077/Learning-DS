public class Main
{
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        
        // O(n^2)
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }else if(i + j == matrix.length - 1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        
        // o(n)
        for(int i = 0; i < matrix.length; i++){
            // Below is for primary diagnol. It only adds when i and j(column in this case) are equal.
            sum += matrix[i][i];
            
            // Below is for secondary diagnol.
            // Below if condition will check if the current element comes in primary diagnol or not. It it does it will not add it to prevent overlapping in case when n  is odd.
            // 'matrix.length - i - 1' is used for findng column number.
            if(i != matrix.length - i - 1){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		System.out.println(diagonalSum(matrix));
	}
}
