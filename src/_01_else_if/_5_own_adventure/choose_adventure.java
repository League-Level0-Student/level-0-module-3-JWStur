package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class choose_adventure {
	
	public static void main(String[] args) {
		
		String answer1 = JOptionPane.showInputDialog("Do you want to fight the dragon?");
		
		if (answer1.toLowerCase().equals("no")) {
			JOptionPane.showMessageDialog(null, "You get smited by the gods and die.");
		}
		else {
			String answer2 = JOptionPane.showInputDialog("Are you brave?");
			if (answer2.toLowerCase().equals("no")) {
				JOptionPane.showMessageDialog(null, "You run away and dig a hole to hide in. You then run out of air in the hole and sufficate.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You go face the dragon who bows its head to you and easily allows you to kill it because it is so afraid.");
			}
		}
		
		
		
		
		
	}

}
