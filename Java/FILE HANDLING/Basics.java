// Import the File class  
import java.io.File;   
class FileInfo {  
    public static void main(String[] args) {  
        // Creating file object  
        File f0 = new File("D:FileOperationExample.txt");  
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
} 



import java.io.FileInputStream;//To read from a program.

class First{
        public static void main(String[] args){
                try{    //For it to work 'Untitled.txt' should exists in the system.
                        FileInputStream fin = new FileInputStream("Untitled.txt");//Creating an object of FileInputStream.
                        int i = 0;//It will store the data and .read() method returns in the form of int.
                        while((i = fin.read()) != -1){//fin.read() is used to read from a file. It reads in the form of bytes.
                                                      //If the end of the file is reached -1 is returned.
                                System.out.print((char) i);//Used to convert int into char
                        }
                        fin.close();
                }
                catch(Exception e){
                        System.out.println(e);
                }
        }
}
