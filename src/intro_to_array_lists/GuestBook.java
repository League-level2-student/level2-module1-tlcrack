package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
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
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
		fra.add(pan);
		pan.add(addName);
		pan.add(viewNames);

		fra.setVisible(true);
		fra.setSize(510, 300);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addName.setText("Add Name");
		addName.setPreferredSize(new Dimension(250, 250));
		addName.addActionListener(this);

		viewNames.setText("View Names");
		viewNames.setPreferredSize(new Dimension(250, 250));
		viewNames.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == viewNames) {
			for (int i = 0; i < names.size(); i++) {
			JOptionPane.showMessageDialog(null, names.get(i));
			}
		}
		if (e.getSource() == addName) {
			names.add(JOptionPane.showInputDialog("Please enter a name."));
			
		}
	}
}
