import java.util.*;

public class basics_of_strings{
    public static void main (String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        
        // Scanner sc = new Scanner(System.in);
        // Taking input
        // 'sc.next()' takes only a single word as a input. It doesn't read spaces or next line;
        // String name = sc.next();
        
        // 'sc.nextLine()' can take in whole line.
        // String name = sc.nextLine();
        // System.out.println(name);
        
        // concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 'charAt' is index based starting from 0.
        System.out.println(fullName.charAt(1));

        // 'length' is a property in array and it is a method in String so you have to call it using ()
    }
}
