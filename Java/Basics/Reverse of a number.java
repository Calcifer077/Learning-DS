public class Main
{
  public static void main (String[]args)
  {
    // Reversing a Number
    // last digit -> num % 10
    // remove last digit -> num / 10
    int num = 12345;
    
    while(num > 0){
        int lastDigit = num % 10;
        System.out.print(lastDigit);
        num = num/10;
    }
  }
}

...............................................................
...............................................................
...............................................................
public class Main
{
  public static void main (String[]args)
  {
    // Reversing a Number
    // last digit -> num % 10
    // remove last digit -> num / 10
    int num = 12345;
    
    int result = 0;
    
    while(num > 0){
        int lastDigit = num % 10;
        result = (result * 10) + lastDigit;
        num = num/10;
    }
    System.out.println(result);
  }
}
