public class Main{
        public void eat(){
            System.out.println("It eats!");
        }
        public void run(){
            System.out.println("It runs");
        }

    public static void main(String args[]){
        Main obj = new Main();
        obj.eat();
        obj.run();
        Main2 obj1 = new Main2();
        obj1.fun();
    }
}

class Main2{
    public void fun(){
        System.out.println("Fun called");
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
import java.util.Scanner;//Importing Scanner package for taking Input.

class Student{
        int uid;
        int section;
}
public class Main{//The name of the file should be " Main " as the execution of the code take place here.
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter student's UID: ");
        obj.uid = in.nextInt();
        System.out.println("Enter Student Section: ");
        obj.section = in.nextInt();
        
        System.out.println("uid of Student is: " + obj.uid);
        System.out.println("Section of Student is: " + obj.section);
        in.close();
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
import java.util.Scanner;

class Rectangle{
    int width;
    int length;
}

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.println("Enter the width of the Rectangle: ");
        obj.width = in.nextInt();
        System.out.println("Enter the length of the Rectangle: ");
        obj.length = in.nextInt();
        System.out.println("The area of the Rectangle is: " + (obj.width * obj.length));
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
import java.util.Scanner;

class Rectangle{
    int width;
    int length;
    
    int perimeter(){
        return (2 * (length + width));
    }
    int area(){
        return (length * width);
    }
}

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.println("Enter the width of the Rectangle: ");
        obj.width = in.nextInt();
        System.out.println("Enter the length of the Rectangle: ");
        obj.length = in.nextInt();
        System.out.println("The perimeter of the Rectangle is: " + obj.perimeter());
        System.out.println("The area of the Rectangle is: " + obj.area());
    }
}
