//Interface can also be used to atain abstraction.
//It is like a complete abstract class.
//It can also be used to achieve multiple inheritance.
interface Animal{//Cannot make its objects in the Main class.
                 //Every method of the interface class should be overridden.
    public void animalSound();
    public void sleep();
}

class Dog implements Animal{
    public void animalSound(){
        System.out.println("The Dog says Bark!!");
    }
    public void sleep(){
        System.out.println("The Dog sleeps!!");
    }
}

class Main{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.animalSound();
        obj.sleep();
    }
}
