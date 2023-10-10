.........................................................................................
.........................................................................................
.........................................................................................
//The below program is used to show why synchronization is required.
class Table{
        public void printtable(int n){
                for(int i = 1; i < 5; i++){
                        System.out.println(n*i);
                        try{
                                Thread.sleep(400);
                        }
                        catch(Exception e){
                                System.out.println(e);
                        }
                }
        }
}

class Mythread1 extends Thread{//creating a thread
        Table t;//creating a object of 'table' class which will be given in the constructor of the 'Mythread1' class.
        Mythread1(Table t){
                this.t = t;
        }
        public void run(){//run method.
                t.printtable(5);
        }
}

class Mythread2 extends Thread{//creating a thread
        Table t;
        Mythread2(Table t){
                this.t = t;
        }
        public void run(){
                t.printtable(100);
        }
}

class First{
        public static void main(String[] args) {
                Table obj = new Table();//creating an object of 'Table'.
                Mythread1 t1 = new Mythread1(obj);
                Mythread2 t2 = new Mythread2(obj);

                t1.start();//Running thread of 'Mythread1'.
                t2.start();//Running thread of 'Mythread2'.
        }
}
//The below program is to implement Synchronized Method.
class Table{
        synchronized void printtable(int n){//Syncronization method.
                for(int i = 1; i < 5; i++){
                        System.out.println(n*i);
                        try{
                                Thread.sleep(400);
                        }
                        catch(Exception e){
                                System.out.println(e);
                        }
                }
        }
}

class Mythread1 extends Thread{
        Table t;
        Mythread1(Table t){
                this.t = t;
        }
        public void run(){
                t.printtable(5);
        }
}

class Mythread2 extends Thread{
        Table t;
        Mythread2(Table t){
                this.t = t;
        }
        public void run(){
                t.printtable(100);
        }
}

class First{
        public static void main(String[] args) {
                Table obj = new Table();
                Mythread1 t1 = new Mythread1(obj);
                Mythread2 t2 = new Mythread2(obj);

                t1.start();
                t2.start();
        }
}
.........................................................................................
.........................................................................................
.........................................................................................
//The below program is to implement synchronization using syncronized block.
class Table{
        public void printtable(int n){
                synchronized(this){//Syncronization Block
                for(int i = 1; i < 5; i++){
                        System.out.println(n*i);
                        try{
                                Thread.sleep(400);
                        }
                        catch(Exception e){
                                System.out.println(e);
                        }
                }
        }
        }
}

class Mythread1 extends Thread{
        Table t;
        Mythread1(Table t){
                this.t = t;
        }
        public void run(){
                t.printtable(5);
        }
}

class Mythread2 extends Thread{
        Table t;
        Mythread2(Table t){
                this.t = t;
        }
        public void run(){
                t.printtable(100);
        }
}

class First{
        public static void main(String[] args) {
                Table obj = new Table();
                Mythread1 t1 = new Mythread1(obj);
                Mythread2 t2 = new Mythread2(obj);

                t1.start();
                t2.start();
        }
}
