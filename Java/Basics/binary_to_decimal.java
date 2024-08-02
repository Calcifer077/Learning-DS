public class binary_to_decimal{
    public static double binaryToDecimal(int n){
        double result = 0;
        int i = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n = n/10;
            result = result + (lastDigit * (Math.pow(2, i)));
            i++;
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(binaryToDecimal(101));
    }
}
