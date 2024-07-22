import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner(System.in);
    int num;
    num = in.nextInt();
    
    boolean isPrime = true;
    for(int i = 2; i < num; i++){
        if(num % i == 0){
            isPrime = false;
        }
    }
    if(isPrime){
        System.out.println("Number is prime");
    }else{
        System.out.println("Number is not prime");
    }
  }
}
