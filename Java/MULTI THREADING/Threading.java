class Main extends Thread{
    public void run(){
        System.out.println("Thread is running!!");
    }
    
    public static void main(String[] args){
        Main t1 = new Main();
        t1.start();
    }
}
.........................................................................................
.........................................................................................
.........................................................................................
class Main implements Runnable{
    public void run(){
        System.out.println("Thread is running!!");
    }
    
    public static void main(String[] args){
        Main m1 = new Main();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
