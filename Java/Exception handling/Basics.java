import java.util.Scanner;

class Basics{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();

		try{
			int result = a / b;
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Something went wrong!");
		}
		finally{//Is used when we want to execute a statement regardless of the result of the try...catch block.
			System.out.println("This is the finally keyword.");
		}
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
