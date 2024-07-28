//Constructor is a special type of method which is used to initialize an objeect.
//It doesn't have a return type.It returns the current class instance.

//Java have two type of constructor which are Default constructor and Parametrized Constructor.

//Below are two program for the implementation of copy constructor.
//Copy constructor
import java.util.Scanner;
class First{
        int id;
        String name;

        First(int id, String name){//Parametrized constructor.
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
.........................................................................................
.........................................................................................
.........................................................................................
import java.util.Scanner;
class First{
        int id;
        String name;

        First(int id, String name){
                this.id = id;
                this.name = name;
        }

        First(){}
                
        void display(){
                System.out.println("The id of the student is: " + id);
                System.out.println("The name of the student is: " + name);
        }
        public static void main(String[] args){
                Scanner In = new Scanner(System.in);
                First o1 = new First(12, "Something");
                First o2 = new First();
                o2.id = o1.id;
                o2.name = o1.name;
                o1.display();
                o2.display();
                In.close();
        }
}
