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
.........................................................................................
.........................................................................................
.........................................................................................
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
.........................................................................................
.........................................................................................
.........................................................................................
//USe of continue satement.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Use of continue statement:"); 
        for(int i = 0; i< 10;i++){
            if((i % 2)==0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
.........>
//Use of break statment:
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Use of continue statement:"); 
        for(int i = 0; i< 10;i++){
            if(i==6){
                break;
            }
            System.out.println(i + " ");
        }
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
