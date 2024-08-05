public class basics_of_inheritance {
    public static void main(String[] args) {
        Fish dolphin = new Fish();
        dolphin.eat();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathes() {
        System.out.println("Breathes");
    }
}

// Derved class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}