public class method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.0, 2.0));
        System.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}