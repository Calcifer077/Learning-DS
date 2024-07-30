public class Main{
    
    public static boolean staircaseSearch(int matrix[][], int key){
        // Below is the case when we are considering top right as our starting point.
        // int row = 0;
        // int col = matrix[0].length-1;
        
        // while(row<matrix.length && col >= 0){
        //     if(matrix[row][col] == key){
        //         System.out.println("Found key at (" + row + "," + col + ")");
        //         return true;
        //     }else if(key < matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Not found!");
        // return false;
        
        // Case when we consider bottom left as our starting point
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }else if(key > matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("not Found");
        return false;
    }
    
    public static void main (String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
