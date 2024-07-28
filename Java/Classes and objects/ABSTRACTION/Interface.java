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
.........................................................................................
.........................................................................................
.........................................................................................
...........................>>>>>>>>.MULTIPLE INTERFACE.<<<<<<<<..........................
interface Animal{
    public void animalSound();
    public void sleep();
}

interface Mammal{
    public void display();
}
class Dog implements Animal, Mammal{
    public void animalSound(){
        System.out.println("The Dog says Bark!!");
    }
    public void sleep(){
        System.out.println("The Dog sleeps!!");
    }
    public void display(){
        System.out.println("This is a method from Mammal interface!!");
    }
}

class Main{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.animalSound();
        obj.sleep();
        obj.display();
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
interface P1{
        //We cannot give definition to the interface method.
	default void show(){//Default method is used to give definition to methods of an interface.
		System.out.println("Default method of P1");
	}
}

interface P2{
	default void show(){
		System.out.println("Default methof of P2");
	}
}
class Test implements P1, P2{
	@Override//Overriding function. tells the compiler we are doing overriding. Can also be used for readability of the code.
	public void show(){
		P1.super.show();//'super' keyword to go to the parent class.
		P2.super.show();
	}

	public void showofP1(){
		P1.super.show();
	}
	public void showofP2(){
		P2.super.show();
	}
}

class Main{
	public static void main(String[] args) {
		Test obj = new Test();
		obj.show();
		System.out.println("Executing specific functions made for P1 and P2");
		obj.showofP1();
		obj.showofP2();
	}
}
