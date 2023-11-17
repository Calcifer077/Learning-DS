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
