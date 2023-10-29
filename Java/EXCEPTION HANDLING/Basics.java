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
.........................................................................................
.........................................................................................
.........................................................................................
class Main{
	public static void validata(int age){
		if(age<18){//The code will not further when this condition is met

			
			//'throw' keyword is used to throw exception explicitly.
			//When you throw an exception using the throw keyword, you are essentially 
			//signaling that something unexpected or erroneous has occurred in your code, 
			//and you want to transfer control to an exception-handling mechanism that can deal with the situation.
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
