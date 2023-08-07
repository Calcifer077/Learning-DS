import java.util.Scanner;

class Helloworld{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        if(age < 18 && age > 13){
            System.out.println("Teenager.");
        }
        else if(age > 18){
            System.out.println("You are above 18. \r");
            System.out.println("You are eligible to vote. \r");
        }
        else{
            System.out.println("You are less than 13");
        }
    }
}
