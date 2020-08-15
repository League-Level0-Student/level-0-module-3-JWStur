package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	
	public static void main(String[] args) {
		
		String answer1 = JOptionPane.showInputDialog("Are you happy?");
		
		if (answer1.toLowerCase().equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		else {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer2.toLowerCase().equals("yes")) {
				JOptionPane.showMessageDialog(null, "Than change what you are doing.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
		}
		
		
		
		
		
	}

}
