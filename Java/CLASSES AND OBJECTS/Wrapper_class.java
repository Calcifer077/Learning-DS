public class Main{
    public static void main(String[] args) {
        int num = 1234;
        Integer num1 = new Integer(num);// Here Integer is a 'wrapper' class.
        System.out.println(num1);
    }
}




public class Main
{
    public static void main(String[] args) {
        int num = 1234;
        Integer num1 = num;//autoboxing

        int num2 = num1;//autounboxing.
        System.out.println(num1);
    }
}
