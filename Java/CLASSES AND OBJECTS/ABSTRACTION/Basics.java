abstract class Animal{
    public abstract void animalSound();
    
    public void sleep(){
        System.out.println("Sleeping!!!!!!");
    }
}

class Dog extends Animal{
    public void animalSound(){
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
