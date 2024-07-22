public class Main
{
    public static int fact(int num){
        int result = 1;
        
        for(int i = 1; i <= num; i++){
            result = result * i;
        }
        
        return result;
    }
	public static void main(String[] args) {
		int num = 5;
		System.out.println(fact(num));
	}
}
