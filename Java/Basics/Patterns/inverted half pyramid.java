public class Main
{
	// 12345
	// 1234
	// 123
	// 12
	// 1
	
    public static void InvertedHalfPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		InvertedHalfPyramid(5);
	}
}
