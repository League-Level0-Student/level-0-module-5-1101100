package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	

		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		String pi = "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812"
;		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
		System.out.println(pi.charAt(0));
		System.out.println(pi.charAt(1));
		System.out.println(pi.charAt(2));
		JOptionPane.showMessageDialog(null, "guess pi, (include the . in 3.14)");
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		
			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
			for (int i = 0; i < pi.length(); i++) {		
				// 5. Ask the user for the NEXT digit of pi.
					String pii = JOptionPane.showInputDialog("enter the next digit of pi");
					
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
					
					// 7. If they are correct, print out "correct".
					if (pi.charAt(i) == pii.charAt(0)) {
						JOptionPane.showMessageDialog(null, "correct");
					}
					else{
						JOptionPane.showMessageDialog(null, "incorrect, the correct answer was " + pi.charAt(i));
						JOptionPane.showMessageDialog(null, "your score was " + (i+1));
						break;
					}
					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
			}
	}
}


