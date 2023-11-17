// Java AWT Program for Hello World 
import java.awt.*; 
import java.awt.event.WindowAdapter; 
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
		frame.addWindowListener(new WindowAdapter() { //This will make the new window close when the close button is pressed.
			@Override
			public void windowClosing(WindowEvent e) 
			{ 
				System.exit(0); 
			} 
		}); 
	} 
}
