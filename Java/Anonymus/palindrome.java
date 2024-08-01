//Checking if the number is palindrome.
import java.util.Scanner;

class palindrome{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for you which want to check: ");
        int n = in.nextInt();
        int temp = n;
        int r, sum = 0;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("The given number is Palindrome.");
        }
        else{
            System.out.println("The given number is not Palindrome.");
        }
    }
}
