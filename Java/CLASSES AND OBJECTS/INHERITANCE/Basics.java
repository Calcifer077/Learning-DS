class Base{
    Base(){
        System.out.println("Base class constructor called!");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived class constructor called!");
    }
}

class Main{
    public static void main(String[] args){
        Base obj1 = new Base();
        Derived obj2 =  new Derived();//will also print the output of base class because it has derived it.
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
