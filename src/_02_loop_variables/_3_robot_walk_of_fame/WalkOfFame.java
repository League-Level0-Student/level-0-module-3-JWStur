
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		
		rob.setSpeed(100);
		rob.moveTo(0, 250);
		rob.setPenColor(0,0,0);
		rob.penDown();
		rob.miniaturize();
		
		for (int j = 1; j <= 20; j++ ) {
			for (int i = 1; i <= 10; i++) {
				rob.move(30);
				rob.turn(144);	
			}
			rob.penUp();
			rob.moveTo(0+(50*j),250);
			rob.penDown();
		}
		
		
		
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
