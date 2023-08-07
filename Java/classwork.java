import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for which you want to check: ");
        int a = s.nextInt();
        System.out.println(a);
        int temp = a;
        int remainder, sum = 0;
        while(a>0){
            remainder = a % 10;
            sum = (sum * 10) + remainder;
            a = a/10;
        }
        if(temp == sum){
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
    }
}


...............................................................................................................


