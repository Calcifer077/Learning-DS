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
.........................................................................................
.........................................................................................
.........................................................................................
//Multi threading.
class First extends Thread{
        public void run(){
                try{
                        System.out.println("Thread" + Thread.currentThread().getId() + "is running");
                }
                catch(Exception e){
                        System.out.println("Exception is caught!");
                }
        }
        public static void main(String[] args) {
                int n = 8;
                for(int i = 0; i < n; i++){
                        First obj = new First();
                        obj.start();
                }
        }
}
