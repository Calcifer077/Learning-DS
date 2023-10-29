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
