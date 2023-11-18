import javax.swing.*;

class Main{
	public static void main(String[] args) {
		JFrame f = new JFrame("A Basic program");
		JButton b = new JButton("Click");

		b.setBounds(130, 100, 100, 40);
		f.add(b);

		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
.........................................................................................
.........................................................................................
.........................................................................................
import javax.swing.*;

class Main{
	public static void main(String[] args) {
		JFrame f = new JFrame();//an instance of JFrame
		JButton b = new JButton("Click here");

		b.setBounds(150, 200, 220, 50);//x, y width, height
		f.add(b);
		f.setSize(500, 600);//width and height
		f.setLayout(null);//setting layout manager as 'null', meaning not using any.
		f.setVisible(true);//Making the frame visible.
	}
}
