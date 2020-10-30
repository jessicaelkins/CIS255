// Jessie Elkins
// CIS 255
// Laboratory Assignment 4
// February 10, 2018
// In this assignment, I am practicing Java concepts such as
// declairing variables, dialog box input and output,
// decision structures, and loops.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JElkins_Lab04
{
	public static void main(String[] args)
	{
		//Declairing variables
		int month;
		double monthlySavings, totalSavings = 0;

		//Declairing objects for input and output
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		String input;

		//Accumulating the amount saved each month
		for (month = 1; month <= 12; month++)
		{
			input = JOptionPane.showInputDialog("Enter the amount you are able to save during month #" + month + ":");
			monthlySavings = Integer.parseInt(input);
			totalSavings = totalSavings + monthlySavings;
		}

		//Displaying the amount the user has saved up over 12 months
		JOptionPane.showMessageDialog(null, "Based on these monthly savings amounts, you will have $" + formatter.format(totalSavings) + " to spend on your vacation next year.");

		//Deciding which message to display based on the amount the user has saved up
		if (totalSavings > 1000.00)
		{
			JOptionPane.showMessageDialog(null, "That's a good chunk of change!");
		}
		else if (totalSavings < 100.00)
		{
			JOptionPane.showMessageDialog(null, "Maybe you should keep saving another year.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I hope you enjoy your vacation!");
		}

		System.exit(0);

	}
}