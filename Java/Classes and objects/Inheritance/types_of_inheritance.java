public class types_of_inheritance {

}

// Types of inheritance
// 1. Single level
/*
 * class Animal{
 * String color;
 * 
 * void eat(){
 * System.out.println("Eats");
 * }
 * }
 * 
 * class Fish extends Animal{
 * int fins;
 * 
 * void swim(){
 * System.out.println("Swims in water");
 * }
 * }
 */

// 2. Multi level inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// 3. Hiearichal inheritance
// 4. Hybrid