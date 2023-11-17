// Java AWT Program for Hello World 
import java.awt.*; 
import java.awt.event.WindowAdapter; 
//An abstract adapter class for receiving window events. Window events like closing a window, resizing it, opening etc.
//The methods in this class are empty. 
//This class exists as convenience for creating listener objects. 
//Extend this class to create a WindowEvent listener and override the methods for the events of interest.
import java.awt.event.WindowEvent; 

// Driver Class 
public class Main { 
	// main function 
	public static void main(String[] args) 
	{ 
		// Declaring a Frame and Label 
		Frame frame = new Frame("Basic Program"); //Will be written at the top of the new window that pops up.
		Label label = new Label("Hello World!"); //It is what will be wriiten in the window.

		// Aligning the label to CENTER 
		label.setAlignment(Label.CENTER); 

		// Adding Label and Setting 
		// the Size of the Frame 
		frame.add(label); 
		frame.setSize(300, 300); 

		// Making the Frame visible 
		frame.setVisible(true); 

		// Using WindowListener for closing the window 
		//The below line adds 'WindowListener' to the frame. It listenes to the event related to a window.
		frame.addWindowListener(new WindowAdapter() { //This will make the new window close when the close button is pressed.
			@Override
			// This method is overridden from the WindowListener interface. 
			//It specifies what should happen when the window is closing.
			public void windowClosing(WindowEvent e) { 
				//This line calls the exit method of the System class, terminating the Java Virtual Machine (JVM) with a status code of 0. 
				//In this context, it means that the application will exit when the window is closed.
				System.exit(0); 
			} 
		}); 
	} 
}
.........................................................................................
.........................................................................................
.........................................................................................
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowEent{
    public static void main(String[] args) {
        Frame f = new Frame("Basic program");//Creating a frame. If we don't write the below setTitle argument given in this will be written on the top of the new window that is created.
        Label l = new Label("Employee id: ");

        Button b = new Button("Submit");//Creating a button on which 'submit' is written.
        TextField t = new TextField("Enter the employee id:");//Creating a textfield(one in which the user can write down). It will come with the given things displayed in it.
	//Here the dimensions are as (x, y, width, height);
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 150, 200, 30);
        b.setBounds(200, 150, 80, 30);

	//Adding the above components onto the frame.
        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400, 300);//Setting the size
        f.setTitle("Employee info");//This will be displayed on the top of the new window that appears.

        f.setLayout(null);//Layout means the arrangement of components within the container.
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

    }
}
.........................................................................................
.........................................................................................
.........................................................................................
