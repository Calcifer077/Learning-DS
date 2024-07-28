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
class Bike{
	public int gear;
	public int speed;

	public Bike(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}

	public String display(){//Output type of String.
		return("No. of gears are "+ gear + "\n" + " Speed of Bike is " + speed);
	}
}
class MountainBike extends Bike{
	public int setheight;
	public MountainBike(int gear, int speed, int startheight){
		super(gear, speed);//Used to refer to the parent class object.
                           //It is necessary when we have a constructor in the base class.
		setheight = startheight;
	}

	@Override public String display(){//@Override method is used to indicate that the child class method is overriding its Base class method.
                                      //It improves the readibilty of the code.
		return(super.display() + "\n Seat Height is: " + setheight);
	}
}

class Main{
	public static void main(String[] args) {
		MountainBike obj = new MountainBike(12, 120, 10);
		System.out.println(obj.display());
	}
}
