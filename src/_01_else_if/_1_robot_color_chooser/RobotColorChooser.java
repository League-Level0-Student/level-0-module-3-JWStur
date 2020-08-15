
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
 		
		Robot r = new Robot();
		Random random =new Random();
		
		r.setSpeed(100);
		r.setPenWidth(10);
		r.penDown();
		
		String strRed = JOptionPane.showInputDialog("How much red?");
		String strGreen = JOptionPane.showInputDialog("How much green?");
		String strBlue = JOptionPane.showInputDialog("How much blue?");
		
		System.out.println(strRed);
		
		if (!strRed.equals("") && !strGreen.equals("") && !strBlue.equals("")) {
			int red = Integer.parseInt(strRed);
			int green = Integer.parseInt(strGreen);
			int blue = Integer.parseInt(strBlue);
			r.setPenColor(red,green,blue);
		
		}
		else {
			int red = random.nextInt(256);
			int green = random.nextInt(256);
			int blue = random.nextInt(256);
			r.setPenColor(red,green,blue);
		}
		
	
		for (int i = 1; i <= 4; i++) {
			r.move(100);
			r.turn(90);
		}
		
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
