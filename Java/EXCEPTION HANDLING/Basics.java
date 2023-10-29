public class Main{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try{
        c = a / b;
        System.out.println(c);
        }
        catch(ArithmeticException n){
            System.out.println("Exception found! ");
        }
        System.out.println("Outside try and catch block! ");
    }
}

class Main{
	public static void validata(int age){
		if(age<18){
			throw new ArithmeticException("Person is not eligible to vote!");
		}
		else{
			System.out.println("Person is eligible to vote");
		}
	}
	public static void main(String[] args) {
		validata(13);
		System.out.println("Rest of the code!");
	}
}
