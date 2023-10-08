//Constructor is a special type of method which is used to initialize an objeect.
//It doesn't have a return type.It returns the current class instance.
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
