import java.util.Scanner;

class basics{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Adding two numbers without taking input from user. \n");
        int a = 10;
        int b = 5;
        System.out.println("Addition of the two number is " + (a+b) + " \n");
        
        System.out.println("Adding two numbers by taking inouts from the user: \n");
        System.out.println("Enter first number: ");
        int c = in.nextInt();
        System.out.println("Enter second number: ");
        int d = in.nextInt();
        System.out.println("Addition of the given two numbers is " + (c + d));
    }
}
