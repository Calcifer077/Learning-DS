//These two classes belong to the java.io package.
//This two classes are used to read and write a stream of character.
//Writer writes the data at one end of the Pipe, and the Reader reads the data from the other end. 
//Usually, the Reader and Writer operate asynchronously with the help of threads.
import java.io.PipedReader;//Importing this to read from a pipe
import java.io.PipedWriter;//Importing this to write in a pipe
  
public class First {  
    public static void main(String[] args) {  
        try {  
            //Here 'read' and 'write' are not inbuilt function, we cna name this function anyhting we want.
            //One thing of importance is that one needs to connect Pipedreader class with PipedWriter class which can be done by giving the object of Pipedreader in the Pipedwriter.
            final PipedReader read = new PipedReader();//Creating a instance for Pipedreader  
            final PipedWriter write = new PipedWriter(read);//Creating a instance for pipedWriter and this is connected to the Pipedreader
            
            //readerThread is not a inbuilt function, we can name this anything.
            Thread readerThread = new Thread(new Runnable() {//Creating thread for reader 
                                                             //Here new Runnable is used to create an instance of Runnable interface which is
                                                             //required to implement thread.
                public void run() {  //Providing implementation of run method which is neccessary for using threads.
                    try {  
                        int data = read.read();  //.read() is an inbuilt function of Pipedreader which returns int which contains the value of the
                                                 //character read.
                        while (data != -1) {  
                            System.out.print((char) data);  //Converting that int into char.
                            data = read.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
            //writerThread is not a inbuilt function, we cna name this anything.
            Thread writerThread = new Thread(new Runnable() {//Creating thread for Writer  
                public void run() {  
                    try {
                        //.write() will write in the pipe.
                        write.write("I love educative widgets\n".toCharArray());  //This will be written on the console and will be read by the PipeReader class.
                                                      //.toCharArray() is used to convert a string into a sequence of charcters.
                    } catch (Exception ex) {  
                    }  
                }  
            });  
            //Both threads are started here.
            //.start() causes the thread to begin execution.
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  //.getMessage() is a method of throwable class which can be used to print a particular string message/
        }  
  
    }  
}  
