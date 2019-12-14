package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primos {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("enter a number");
	int i = 0;
	for ( i = 2; i < Integer.parseInt(num); i++) {
		

	if (Integer.parseInt(num) % i == 0) {
		JOptionPane.showMessageDialog(null, "that is not a prime number");
		break;
	}
	}
	 if (i == Integer.parseInt(num) ) 
		{
			JOptionPane.showMessageDialog(null, "that is a prime number1");
		}
		
	}	
}

