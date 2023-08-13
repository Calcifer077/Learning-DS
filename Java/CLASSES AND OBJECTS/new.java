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


import java.util.Scanner;

class Student{
        int uid;
        int section;
}
public class Main{
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
