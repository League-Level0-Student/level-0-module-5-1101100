package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			rob.setPenColor(255,0,0);
		}
		else if (colorChoice == 1) {
			rob.setPenColor(0,255,0);
		}
		else if (colorChoice == 2) {
			rob.setPenColor(0,0,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String num = JOptionPane.showInputDialog("how many polygons do you want");
		int numberPolygon = Integer.parseInt(num);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < numberPolygon; i++) {
			rob.penDown();
			rob.setSpeed(100);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
		
	}

}

