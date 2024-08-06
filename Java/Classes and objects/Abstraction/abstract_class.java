public class abstract_class {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.eat();
        e.walk();
        System.out.println(e.color);

        Duck d = new Duck();
        d.eat();
        d.walk();
    }
}

// Abstract classes can't have their objects
// Abstact classes can have both abstract and non abstract methods
// Abstract function don't have a definition they are defined by their
// subclasses

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Elephant extends Animal {
    void changeColor() {
        color = "Grey";
    }

    void walk() {
        System.out.println("A elephant walks on 4 legs");
    }
}

class Duck extends Animal {
    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("A duck walks on 2 legs");
    }
}