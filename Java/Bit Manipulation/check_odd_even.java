public class check_odd_even
{
    // public static void checkEvenOdd(int num){
    //     num = num & 1;
    //     if(num == 1){
    //         System.out.println("Odd");
    //     }else{
    //         System.out.println("Even");
    //     }
    // }

    public static void checkEvenOdd(int num){
        int bitmask = 1;
        if((num & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
	public static void main(String[] args) {
		checkEvenOdd(11);
	}
}
