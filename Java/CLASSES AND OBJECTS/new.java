public class Main{
        public void eat(){
            System.out.println("It eats!");
        }
        public void run(){
            System.out.println("It runs");
        }

    public static void main(String args[]){
        Main obj = new Main();
        obj.eat();
        obj.run();
        Main2 obj1 = new Main2();
        obj1.fun();
    }
}

class Main2{
    public void fun(){
        System.out.println("Fun called");
    }
}
