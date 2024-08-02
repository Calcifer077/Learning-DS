public class check_if_number_power_of_two {
    public static boolean checkIfPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPowerOfTwo(4));
    }   
}
 