class Base{
    void print(){
        System.out.println("This is the Base class.");
    }
}

class Derived1 extends Base{
    void print(){
        System.out.println("The is the derived1 class.");
    }
}

class Derived2 extends Base{
    void print(){
        System.out.println("The is the derived2 class.");
    }
}

public class Main{
    public static void main(String[] args) {
        Base obj1;
        obj1 = new Derived1();
        obj1.print();
        obj1 = new Derived2();
        obj1.print();
    }
}
