//These two classes belong to the java.io package.
//This two classes are used to read and write a stream of character.
//Writer writes the data at one end of the Pipe, and the Reader reads the data from the other end. 
//Usually, the Reader and Writer operate asynchronously with the help of threads.
import java.io.PipedReader;//Importing this to read from a pipe
import java.io.PipedWriter;//Importing this to write in a pipe
  
public class First {  
    public static void main(String[] args) {  
        try {  
  
            final PipedReader read = new PipedReader();//Creating a instance for Pipedreader  
            final PipedWriter write = new PipedWriter(read);//Creating a instance for pipedWriter and this is connected to the Pipedreader
  
            Thread readerThread = new Thread(new Runnable() {//Creating thread for reader 
                                                             //Here new Runnable is used to create an instance of Runnable interface which is
                                                             //required to implement thread.
                public void run() {  //Providing implementation of run method which is neccessary for using threads.
                    try {  
                        int data = read.read();  
                        while (data != -1) {  
                            System.out.print((char) data);  
                            data = read.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            Thread writerThread = new Thread(new Runnable() {//Creating thread for Writer  
                public void run() {  
                    try {  
                        write.write("I love educative widgets\n".toCharArray());  //This will be written on the console and will be read by the PipeReader class.
                    } catch (Exception ex) {  
                    }  
                }  
            });  
            //Both threads are started here.
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
  
    }  
}  
