//Polymorphism
import java.util.Scanner;
class Base{
    void area(){
        System.out.println("No arguments passed");
    }
    void area(int a, int b){
        System.out.println("The area of the gieven rectangle is: " + (a * b));
    }
    void area(double a, double b){
        System.out.println("The area of the given rectangle is: " + (a + b));
    }
}

class Main{
    public static void main(String[] args){
        Base obj = new Base();
        obj.area();
        obj.area(2,3);
        obj.area(5.0, 4.8);
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
