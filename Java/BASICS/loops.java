//Program to print "Hello world 10 times.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program to print Hello world 10 times. \r"); 
        for(int i = 0; i< 10;i++){
            System.out.println("Hello world.\r");
        }
    }
}
//Program to sum first 10 integers.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program to sum first 10 integers \r"); 
        int sum = 0;
        for(int i = 0; i< 10;i++){
            sum =+ sum + i;
        }
        System.out.println(sum);
    }
}
