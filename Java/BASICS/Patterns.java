import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    // Output
    // 4
    // *
    // **
    // ***
    // ****
    
    Scanner in = new Scanner(System.in);
    int num;
    num = in.nextInt();
    
    // int i = 1;
    // while(i <= num){
    //     int j = 1;
    //     while(j <= i){
    //         System.out.print('*');
    //         j++;
    //     }
    //     System.out.println();
    //     i++;
    // }
    
    for(int i = 1; i <= num; i++){
        for(int star = 1; star <= i; star++){
            System.out.print('*');
        }
        System.out.println();
    }
  }
}

.........................................................................................
.........................................................................................
.........................................................................................
  
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    // Output:
    // 3
    // ***
    // **
    // *
    Scanner in = new Scanner(System.in);
    int num;
    num = in.nextInt();
    
    // int line = 1;
    // while(line <= num){
    //     int star = line;
        
    //     while(star <= num){
    //         System.out.print('*');
    //         star++;
    //     }
        
    //     System.out.println();
    //     line++;
    // }
    for(int line = 1; line <= num; line++){
        for(int star = 1; star <= (num - line + 1); star++){
            System.out.print('*');
        }
        System.out.println();
    }
  }
}

.........................................................................................
.........................................................................................
.........................................................................................

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    // Output:
    // 3
    // 1
    // 12
    // 123
    Scanner in = new Scanner(System.in);
    int num;
    num = in.nextInt();
    
    int line = 1;
    while(line <= num){
        int j = 1;
        while(j <= line){
            System.out.print(j);
            j++;
        }
        System.out.println();
        line++;
    }
  }
}

.........................................................................................
.........................................................................................
.........................................................................................

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    // Output:
    // 3
    // A
    // BC
    // DEF

    // 3
    // 1
    // 23
    // 456

    Scanner in = new Scanner(System.in);
    int num;
    num = in.nextInt();
    
    int line = 1;
    char count = 'A';
    // int count = 1;
    while(line <= num){
        int j = 1;
        while(j <= line){
            System.out.print(count);
            count++;
            j++;
        }
        System.out.println();
        line++;
    }
  }
}
