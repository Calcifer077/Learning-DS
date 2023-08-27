//Abstraction is the hiding of certain details and only showing the details which are necessary.
//Example -> Working of a car. We don't knoq about each and every details of the car but we know the end results which is its motion.
abstract class Animal{//declaring abstract class which is neccassart to acieve abstraction.
    public abstract void animalSound();//abstract method -> doesn't have body in the parent class but will have in the subclass.
                                       //cannot create its object in the Main method.
    public void sleep(){//normal method with its body.
        System.out.println("Sleeping!!!!!!");
    }
}

class Dog extends Animal{
    public void animalSound(){//Defining the abstract method here.
        System.out.println("The Dog barks!!");
    }
}

class Main{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.animalSound();
        obj.sleep();
    }
}
