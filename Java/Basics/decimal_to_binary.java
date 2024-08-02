public class decimal_to_binary{
    public static double decimalToBinary(int n){
        double result = 0;
        int pow = 0;
        while(n > 0){
            int rem = n % 2;
            n = n/2;
            result = result + (rem * (Math.pow(10, pow)));
            pow++;
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(decimalToBinary(7));
    }
}
