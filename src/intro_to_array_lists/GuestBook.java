package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		GuestBook gub = new GuestBook();
		gub.GUI();
	}
	public void GUI() {
		fra.add(pan);
		pan.add(addName);
		pan.add(viewNames);
		
		fra.setVisible(true);
		fra.setSize(500, 500);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
