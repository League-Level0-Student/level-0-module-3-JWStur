
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		String input = JOptionPane.showInputDialog("How many cats do you have?");
		
		int cats = Integer.parseInt(input);
		
		if (cats > 0) {
			if (cats >= 3) {
				JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
			}
			else {
				JOptionPane.showMessageDialog(null, "You have a good amount of cats");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You are a lonely person with no cats");
		}
		
		
	}

//	
//
//	static void playVideo(String videoURL) {
//		try {
//			URI uri = new URI(videoURL);
//			java.awt.Desktop.getDesktop().browse(uri);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}

