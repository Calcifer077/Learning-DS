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
.........................................................................................
.........................................................................................
.........................................................................................
//program to give Rectangle area.
import java.util.Scanner;
class Rectangle{
    
    int a,b;
    void setvalue(int x, int y){
        a = x;
        b = y;
    }
    int result(){
        return (a * b);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the the two sides of Rectangle: ");
        int a = in.nextInt();
        int b = in.nextInt();
        Rectangle obj = new Rectangle();
        obj.setvalue(a, b);
        System.out.println(obj.result());
    }
}

.........................................................................................
.........................................................................................
.........................................................................................
//Copy constructor
import java.util.Scanner;

class First{
        int id;
        String name;

        First(int id, String name){
                this.id = id;
                this.name = name;
        }

        First(First o){
                id = o.id;
                name = o.name;
        }
        void display(){
                System.out.println("The id of the student is: " + id);
                System.out.println("The name of the student is: " + name);
        }
        public static void main(String[] args){
                Scanner In = new Scanner(System.in);
                First o1 = new First(12, "Something");
                First o2 = new First(o1);
                o1.display();
                o2.display();
                In.close();
        }
}
